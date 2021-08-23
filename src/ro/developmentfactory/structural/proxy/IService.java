package ro.developmentfactory.structural.proxy;

import java.util.List;
import java.util.function.Predicate;

public interface IService<T extends BaseEntity> {
    List<T> getAll();

    List<T> getAll(Predicate<T> p);

    T getById(int id);

    void add(T entity);

    void remove(T entity);
}
