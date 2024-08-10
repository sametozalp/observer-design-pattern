public class Parent implements Observer {

    private String name;

    public Parent(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        Termometer term = (Termometer) observable;
        System.out.println(name + " said: Temperature is " + term.getTemperature());
    }
}
