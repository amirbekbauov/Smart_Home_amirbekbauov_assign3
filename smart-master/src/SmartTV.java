class SmartTV extends StreamGadget {
    public void receiveNotification(String message) {
        System.out.println("SmartTV had a notification: " + message);
    }

    public void batteryStatus() {
        System.out.println("Smart TV battery charge level: 50%");
    }

    public void changeChannel(int channel) {
        System.out.println("Switching the channel to: " + channel);
    }

    public void connectionComplete() {
        System.out.println("The smart TV has been connected.");
    }

    @Override
    public void streamVideo(String URL) {
        System.out.println("TV streams the video:" + URL);
    }
}