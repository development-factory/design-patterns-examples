package ro.developmentfactory.structural.proxy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProxyDataService implements IService<Employee>{
    private Repository<Employee> cachedEmployees = new Repository<>(new ArrayList<>());
    private final IService<Employee> webService = new WebService();
    private LocalDateTime lastCached;
    private static final int MINUTES_IN_HOUR = 3600;

    // Check if it's first run or more than 1 hour has passed
    private boolean cacheExpired(){
        if(lastCached == null) {
            lastCached = LocalDateTime.now();
            return true;
        }
        Duration durationSinceLastCached = Duration.between(LocalDateTime.now(), lastCached);
        boolean isCacheExpired = durationSinceLastCached.getSeconds() > MINUTES_IN_HOUR;
        if(!isCacheExpired) printInfo();
        return isCacheExpired;
    }

    @Override
    public List<Employee> getAll() {
        // If cache expired, replace all cache with the result of the request
        if(cacheExpired()){
            cachedEmployees = new Repository<>(new ArrayList<>());
            cachedEmployees.addRange(webService.getAll());
            lastCached = LocalDateTime.now();
        }
        return cachedEmployees.getAll();
    }

    @Override
    public List<Employee> getAll(Predicate<Employee> p) {
        // If cache expired, delegate the request to the web service and cache the result
        // else return cached data
        if(cacheExpired()){
            cachedEmployees = new Repository<>(new ArrayList<>());
            List<Employee> result = webService.getAll(p);
            cachedEmployees.addRange(result);
            lastCached = LocalDateTime.now();
            return result;
        }
        return cachedEmployees.getAll(p);
    }

    @Override
    public Employee getById(int id) {
        // If cache expired, delegate the request to the web service and cache the result
        // else return cached data
        if(cacheExpired()){
            cachedEmployees = new Repository<>(new ArrayList<>());
            Employee result = webService.getById(id);
            cachedEmployees.add(result);
            lastCached = LocalDateTime.now();
            return result;
        }
        return cachedEmployees.getById(id);
    }

    @Override
    public void add(Employee employee) {
        webService.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        webService.remove(employee);
    }

    private void printInfo(){
        System.out.printf("%s: Returning cached data", LocalDateTime.now().toLocalTime());
        System.out.println();
    }
}
