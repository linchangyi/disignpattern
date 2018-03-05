package proxy;

import proxy.Subject;

/**
 * @author LinChangyi
 * @date 2018/2/27
 **/
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("perform request");
    }
}
