package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LinChangyi
 * @date 2018/3/5
 **/
public class Subject {
    /**
     * 观察者
     */
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: observers){
            observer.update(this);
        }
    }
}
