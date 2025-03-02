package Obervable;

import Observer.NotificationObserver;

public interface NotificationObservable {
    public void add(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);
    public void notifySubscriber();
    public void setStockCount(int stockCount);
    public int getStockCount();

}
