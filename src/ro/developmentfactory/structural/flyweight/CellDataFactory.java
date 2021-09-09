package ro.developmentfactory.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CellDataFactory {
    private static final List<Data> dataPool = new ArrayList<>();

    private CellDataFactory() { }

    public static Data get(String color, String value){
        Data data = dataPool.stream().filter(d ->
                d.getValue().equals(value) &&
                d.getColor().equals(color))
                .findFirst()
                .orElse(null);

        if(data == null){
            data = new Data(value, color);
            dataPool.add(data);
        }
        return data;
    }

    public static int getNumberOfCells(){
        return dataPool.size();
    }
}
