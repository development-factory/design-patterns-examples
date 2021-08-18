package ro.developmentfactory.structural.proxy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Proxy implements IService{
    private List<Employee> cachedEmployees = new ArrayList<>();
    private final IService webService;
    private LocalDateTime lastCached;
    private static final int MINUTES_IN_HOUR = 3600;

    public Proxy(IService webService) {
        this.webService = webService;
    }

    // Check if it's first run or more than 1 hour has passed
    private boolean cacheExpired(){
        if(lastCached == null) {
            lastCached = LocalDateTime.now();
            return true;
        }
        Duration durationSinceLastCached = Duration.between(LocalDateTime.now(), lastCached);
        return durationSinceLastCached.getSeconds() > MINUTES_IN_HOUR;
    }

    @Override
    public List<Employee> getEmployees() {
        // If cache expired, replace all cache with the result of the request
        if(cacheExpired()){
            cachedEmployees = webService.getEmployees();
            lastCached = LocalDateTime.now();
        }
        return cachedEmployees;
    }

    @Override
    public List<Employee> getEmployees(Predicate<Employee> p) {
        // If cache expired, delegate the request to the web service and cache the result
        // else return cached data
        if(cacheExpired()){
            List<Employee> result = webService.getEmployees(p);
            cachedEmployees.addAll(result);
            lastCached = LocalDateTime.now();
            return result;
        }
        return cachedEmployees.stream().filter(p).collect(Collectors.toList());
    }

    @Override
    public Employee getEmployee(int id) {
        // If cache expired, delegate the request to the web service and cache the result
        // else return cached data
        if(cacheExpired()){
            Employee result = webService.getEmployee(id);
            cachedEmployees.add(result);
            lastCached = LocalDateTime.now();
            return result;
        }
        return cachedEmployees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void addEmployee(Employee employee) {
        webService.addEmployee(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        webService.removeEmployee(employee);
    }
}
