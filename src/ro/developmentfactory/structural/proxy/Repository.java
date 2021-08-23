package ro.developmentfactory.structural.proxy;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repository<T extends BaseEntity> implements IService<T>{
    private final List<T> data;
    private int recordsKey = 0;

    public Repository(List<T> data) {
        this.data = data;
    }

    public List<T> getAll(){
        return data;
    }

    public List<T> getAll(Predicate<T> predicate){
        return data.stream().filter(predicate).collect(Collectors.toList());
    }

    public T getById(int id){
        return data.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public void add(T t){
        recordsKey++;
        t.setId(recordsKey);
        data.add(t);
    }

    public void addRange(List<T> collection){
        collection.forEach(e -> e.setId(recordsKey++));
        data.addAll(collection);
    }

    public void remove(T t){
        data.remove(t);
    }
}
