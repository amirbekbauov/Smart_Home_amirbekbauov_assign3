class SmartWatch extends Gadget {
    public void receiveNotification(String message) {
        System.out.println("Smart watch has received a notification: " + message);
    }

    public void batteryStatus() {
        System.out.println("The battery charge level of the smart watch: 36%");
    }

    public void trackHeartRate() {
        System.out.println("Pulse tracking.");
    }

    public void showTime() {
        System.out.println("Display the current time.");
    }

    public void connectionComplete() {
        System.out.println("The smartwatch has been connected.");
    }
}