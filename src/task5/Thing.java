package task5;

public class Thing {
    private int volume; //объем
    private int value; //ценность
    private String name; //название предмета, доп. параметр

    public Thing(int volume, int value, String name) {
        this.volume = volume;
        this.value = value;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
