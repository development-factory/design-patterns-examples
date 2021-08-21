package ro.developmentfactory.structural.proxy;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class WebService implements IService<Employee> {
    private final Repository<Employee> repo = new Repository<>(new ArrayList<>());

    // All employees
    @Override
    public List<Employee> getEmployees(){
        simulateDelay(2000);
        return repo.getAll();
    }

    // Filter employees with predicate
    @Override
    public List<Employee> getEmployees(Predicate<Employee> p){
        simulateDelay(1000);
        return repo.getAll(p);
    }

    // Get employee by id
    @Override
    public Employee getEmployee(int id){
        simulateDelay(2000);
        return repo.getById(id);
    }

    // Add new employee
    @Override
    public void addEmployee(Employee employee){
        repo.add(employee);
    }

    // Remove employee
    @Override
    public void removeEmployee(Employee employee){
        repo.remove(employee);
    }

    private void simulateDelay(int milliseconds){
        try {
            System.out.printf("%s: Please wait, fetching data from web service.", LocalDateTime.now().toLocalTime());
            System.out.println();
            // Http request delay simulation
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
