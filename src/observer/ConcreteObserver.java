package observer;

/**
 * @author LinChangyi
 * @date 2018/3/5
 **/
public class ConcreteObserver implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("观察者被调用了");
    }
}
