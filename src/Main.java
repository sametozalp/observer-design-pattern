public class Main {
    public static void main(String[] args) {
        int minTemperature = 23;
        int maxTemperature = 28;

        Termometer term = new Termometer(minTemperature, maxTemperature);

        Parent mom = new Parent("mom");
        Parent dad = new Parent("dad");

        term.addObserver(mom);
        term.addObserver(dad);

        for (int i = (int) term.getTemperature(); i <= 30; i++) {
            term.setTemperature(i);
        }

        for (int i = (int) term.getTemperature(); i >= 22; i--) {
            term.setTemperature(i);
        }
    }
}