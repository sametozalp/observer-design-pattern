public class Termometer extends Observable {

    private double temperature;
    private double minTemperature;
    private double maxTemperature;

    public Termometer(double minTemperature, double maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.temperature = 25;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;

        System.out.println(temperature);

        controlTemperature();
    }

    private void controlTemperature() {
        notifyObservers();
    }
}
