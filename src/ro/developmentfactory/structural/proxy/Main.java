package ro.developmentfactory.structural.proxy;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IService<Employee> proxy = new Proxy();
        proxy.addEmployee(new Employee("Ion", "Popescu", "Bucuresti", "ion.popescu@test.com"));
        proxy.addEmployee(new Employee("Ioana", "Ionescu", "Bucuresti", "ioanaionescu@test.com"));
        List<Employee> employeesFirstRead = proxy.getEmployees();
        printEmployees(employeesFirstRead);
        System.out.println();

        List<Employee> employeesSecondRead = proxy.getEmployees();
        printEmployees(employeesSecondRead);
    }

    static void printEmployees(List<Employee> employees){
        employees.forEach(e -> System.out.printf("%s: First Name: %s, Last Name: %s, Email: %s \n", LocalDateTime.now().toLocalTime(),e.getFirstName(), e.getLastName(), e.getEmail()));
    }
}
