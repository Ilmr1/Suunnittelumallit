package weather;

public class WeatherObserver implements Observer {
    private String name;

    public WeatherObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(double temperature) {
        System.out.println(name + " received update: Current temperature is " + String.format("%.2f", temperature) + " degrees.");
    }
}