package observer;

/**
 * @author LinChangyi
 * @date 2018/3/5
 **/
public class Client {
    public static void main(String[] args){
        Subject subject = new Subject();

        Observer observer = new ConcreteObserver();

        subject.addObserver(observer);

        observer.notify();
    }
}
