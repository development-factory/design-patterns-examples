package ro.developmentfactory.structural.flyweight;

public class Data {
    private final String value;
    private final String color;

    public Data(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public String getValue() {
        return value;
    }

    public String getColor() {
        return color;
    }
}
