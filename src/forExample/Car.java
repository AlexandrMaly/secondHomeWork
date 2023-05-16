package forExample;

public class Car {
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity(){
        System.out.println("Electricity is start");
    }

    private void startCommand(){
        System.out.println("Command is start");
    }

    private void startFuelSystem(){
        System.out.println("System is start");
    }

}
