package wzorce.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weather {
    private List<Person> observers;
    private int currentTemperature;

    public Weather() {
        observers = new ArrayList<>();
        currentTemperature = 0;
    }

    public void addObserver(Person... people) {
        observers.addAll(Arrays.asList(people));
    }

    public void update (int newTemperature) {
        currentTemperature = newTemperature;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Person person : observers) {
            if(currentTemperature>person.getMaxTemp()) {
                person.update(currentTemperature);
            }
        }
    }


}
