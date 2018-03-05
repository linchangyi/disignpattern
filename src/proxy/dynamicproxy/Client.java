package proxy.dynamicproxy;

import proxy.RealSubject;
import proxy.Subject;

/**
 * @author LinChangyi
 * @date 2018/2/27
 **/
public class Client {
    public static void main(String[] args){
        Subject subject = new RealSubject();
        new DynamicProxy().getInstance(subject).request();
    }
}
