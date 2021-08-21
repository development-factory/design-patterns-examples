package ro.developmentfactory.structural.proxy;

import java.util.List;
import java.util.function.Predicate;

public interface IService<T extends BaseEntity> {
    List<T> getEmployees();

    List<T> getEmployees(Predicate<T> p);

    Employee getEmployee(int id);

    void addEmployee(T entity);

    void removeEmployee(T entity);
}
