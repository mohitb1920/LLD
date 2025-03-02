package Observer;

import Obervable.NotificationObservable;

public class EmailNotificationObserver implements NotificationObserver {

    public String email;
    NotificationObservable notificationObservable;
    public EmailNotificationObserver(String email, NotificationObservable notificationObservable){
        this.email = email;
        this.notificationObservable=notificationObservable;
    }
    @Override
    public void update(){
        System.out.println("Notification sent to email :-"+ email);
    }
}
