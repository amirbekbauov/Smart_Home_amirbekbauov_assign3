import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        SmartWatch watch = new SmartWatch();
        SmartTV tv = new SmartTV();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Smart Device Control Panel.");

        while (true) {
            System.out.println("Select a device:");
            System.out.println("1. Phone");
            System.out.println("2. Watch");
            System.out.println("3. TV");
            System.out.println("4. Exit");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        controlPhone(phone, scanner);
                        break;
                    case 2:
                        controlWatch(watch, scanner);
                        break;
                    case 3:
                        controlTV(tv, scanner);
                        break;
                    case 4:
                        System.out.println("Exiting Smart Device Control Panel.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Choice only numbers of list.");
                scanner.nextLine(); // consume invalid input
            }
        }
    }

    private static void controlPhone(SmartPhone phone, Scanner scanner) {
        boolean exitControl = false;

        while (!exitControl) {
            System.out.println("Select an action for the phone:");
            System.out.println("1. Receive notification");
            System.out.println("2. Make a call");
            System.out.println("3. Send SMS");
            System.out.println("4. Check battery status");
            System.out.println("5. Connect to internet");
            System.out.println("6. Exit phone control");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter notification message:");
                        phone.receiveNotification(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter phone number:");
                        phone.makeCall(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter SMS message:");
                        phone.sendSMS(scanner.nextLine());
                        break;
                    case 4:
                        phone.batteryStatus();
                        break;
                    case 5:
                        phone.connectToInternet();
                        break;
                    case 6:
                        System.out.println("Exiting phone control.");
                        exitControl = true;
                        break;
                    case 7:
                        System.out.println("Enter video URL:");
                        phone.streamVideo(scanner.nextLine());
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Choice only numbers of list.");
                scanner.nextLine(); // consume invalid input
            }
        }
    }


    private static void controlWatch(SmartWatch watch, Scanner scanner) {
        boolean exitControl = false;

        while (!exitControl) {
            System.out.println("Select an action for the watch:");
            System.out.println("1. Receive notification");
            System.out.println("2. Track heart rate");
            System.out.println("3. Check battery status");
            System.out.println("4. Show time");
            System.out.println("5. Connect to internet");
            System.out.println("6. Exit watch control");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter notification message:");
                        watch.receiveNotification(scanner.nextLine());
                        break;
                    case 2:
                        watch.trackHeartRate();
                        break;
                    case 3:
                        watch.batteryStatus();
                        break;
                    case 4:
                        watch.showTime();
                        break;
                    case 5:
                        watch.connectToInternet();
                        break;
                    case 6:
                        System.out.println("Exiting watch control.");
                        exitControl = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Choice only numbers of list.");
                scanner.nextLine(); // consume invalid input
            }
        }
    }


    private static void controlTV(SmartTV tv, Scanner scanner) {
        boolean exitControl = false;

        while (!exitControl) {
            System.out.println("Select an action for the TV:");
            System.out.println("1. Receive notification");
            System.out.println("2. Stream video");
            System.out.println("3. Change channel");
            System.out.println("4. Check battery status");
            System.out.println("5. Connect to internet");
            System.out.println("6. Exit TV control");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter notification message:");
                        tv.receiveNotification(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter video URL:");
                        tv.streamVideo(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter channel number:");
                        tv.changeChannel(scanner.nextInt());
                        break;
                    case 4:
                        tv.batteryStatus();
                        break;
                    case 5:
                        tv.connectToInternet();
                        break;
                    case 6:
                        System.out.println("Exiting TV control.");
                        exitControl = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Choice only numbers of list.");
                scanner.nextLine(); // consume invalid input
            }
        }
    }
}

