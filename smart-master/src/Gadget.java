abstract class Gadget implements SmartDevice {
    public void turnOn() {
        System.out.println("Gadget On.");
    }

    public void turnOff() {
        System.out.println("Gadget off.");
    }

    public void connectToInternet() {
        System.out.println("Gadget connected to internet.");
    }

    public abstract void connectionComplete();
    public abstract void receiveNotification(String message);
    public abstract void batteryStatus();
}