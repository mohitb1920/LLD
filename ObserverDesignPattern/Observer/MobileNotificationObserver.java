package Observer;

import Obervable.NotificationObservable;

public class MobileNotificationObserver implements NotificationObserver {
    public String userName;
    NotificationObservable notificationObservable;
    public MobileNotificationObserver(String userName,  NotificationObservable notificationObservable){
        this.userName = userName;
        this.notificationObservable = notificationObservable;
    }
    @Override
    public void update(){
        System.out.println("Notification sent to mobile :-"+ userName);
    }
}
