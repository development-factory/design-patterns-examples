package ro.developmentfactory.structural.proxy;

import java.util.List;
import java.util.function.Predicate;

public interface IService {
    List<Employee> getEmployees();

    List<Employee> getEmployees(Predicate<Employee> p);

    Employee getEmployee(int id);

    void addEmployee(Employee employee);

    void removeEmployee(Employee employee);
}
