package weather;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {
    private List<Observer> observers;
    private double temperature;
    private boolean running;
    private final Random random;

    public WeatherStation() {
        this.observers = new ArrayList<>();
        this.random = new Random();
        this.temperature = 15 + random.nextDouble() * 10;
        this.running = true;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }

    private void updateTemperature() {
        double change = (random.nextDouble() * 2) - 1;
        temperature = Math.max(-10, Math.min(40, temperature + change));
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep((random.nextInt(5) + 1) * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            updateTemperature();
            notifyObservers();
        }
    }

    public void stop() {
        running = false;
    }
}