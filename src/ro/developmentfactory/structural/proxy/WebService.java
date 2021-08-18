package ro.developmentfactory.structural.proxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class WebService implements IService {
    private final List<Employee> employeesDb = new ArrayList<>();

    // All employees
    @Override
    public List<Employee> getEmployees(){
        simulateDelay(2000);
        return employeesDb;
    }

    // Filter employees with predicate
    @Override
    public List<Employee> getEmployees(Predicate<Employee> p){
        simulateDelay(1000);
        return employeesDb.stream().filter(p).collect(Collectors.toList());
    }

    // Get employee by id
    @Override
    public Employee getEmployee(int id){
        simulateDelay(2000);
        return employeesDb.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    // Add new employee
    @Override
    public void addEmployee(Employee employee){
        simulateDelay(1500);
        int maxId = Collections.max(employeesDb, Comparator.comparingInt(Employee::getId)).getId();
        employee.setId(maxId + 1);
        employeesDb.add(employee);
    }

    // Remove employee
    @Override
    public void removeEmployee(Employee employee){
        simulateDelay(1000);
        employeesDb.remove(employee);
    }

    private void simulateDelay(int milliseconds){
        try {
            // Http request delay simulation
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
