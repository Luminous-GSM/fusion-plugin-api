package models.statistics;

public class StatisticItem<T> {
    private String name;
    private StatisticType type;
    private T value;

    public StatisticItem() {
    }

    public StatisticItem(String name, StatisticType type, T value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatisticType getType() {
        return type;
    }

    public void setType(StatisticType type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
