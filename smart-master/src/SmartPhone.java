class SmartPhone extends StreamGadget {
    public void receiveNotification(String message) {
        System.out.println("The phone received a notification: " + message);
    }

    public void batteryStatus() {
        System.out.println("The charging level of the phone: 14%");
    }

    public void makeCall(String number) {
        System.out.println("Calling this number " + number);
    }

    public void sendSMS(String message) {
        System.out.println("Sending sms: " + message);
    }

    public void connectionComplete() {
        System.out.println("Phone connected.");
    }


    public void streamVideo(String URL) {
        System.out.println("Phone streams the video:" + URL);
    }
}