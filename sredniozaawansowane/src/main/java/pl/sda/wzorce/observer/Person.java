package pl.sda.wzorce.observer;

public class Person {
    private String name;
    private int maxTemp;

    public Person(String name, int maxValue) {
        this.name = name;
        this.maxTemp = maxValue;
    }

    public String getName() {
        return name;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void update(int currentTemperature) {
        System.out.printf("%s twierdzi, że temperatura %s to za gorąco. Dla mnie max to %d\n", name, currentTemperature, maxTemp);
    }

}
