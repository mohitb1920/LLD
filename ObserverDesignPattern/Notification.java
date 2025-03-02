import Obervable.IphoneNotificationObservableImpl;
import Obervable.NotificationObservable;
import Observer.EmailNotificationObserver;
import Observer.MobileNotificationObserver;
import Observer.NotificationObserver;

public class Notification {
    public static void main(String[] args) {
        System.out.println("Notification system started");
        NotificationObservable notificationObservable = new IphoneNotificationObservableImpl();
        NotificationObserver notificationObservable1 = new EmailNotificationObserver("abc@gmail.com",notificationObservable);
        NotificationObserver notificationObservable2 = new EmailNotificationObserver("xyz@gmail.com",notificationObservable);
        NotificationObserver notificationObservable3 = new MobileNotificationObserver("abc_xyz",notificationObservable);

        notificationObservable.add(notificationObservable1);
        notificationObservable.add(notificationObservable2);
        notificationObservable.add(notificationObservable3);

        notificationObservable.setStockCount(10);
        notificationObservable.setStockCount(100);
        System.out.println(notificationObservable.getStockCount());

        System.out.println("Notification system closed");


    }
}