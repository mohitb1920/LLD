package Obervable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneNotificationObservableImpl implements NotificationObservable {
    private int stockCount =0;
    List<NotificationObserver> observerList = new ArrayList<>();
    @Override
    public void add(NotificationObserver notificationObserver){
        observerList.add(notificationObserver);
    }
    @Override
    public void remove(NotificationObserver notificationObserver){
        observerList.remove(notificationObserver);
    }
    @Override
    public void notifySubscriber(){
        for(NotificationObserver notificationObserver:observerList){
            notificationObserver.update();
        }
    }
    @Override
    public void setStockCount(int count){
        if(stockCount==0){
            notifySubscriber();
        }
        stockCount+=count;
    }
    @Override
    public int getStockCount(){
        return stockCount;
    }
}
