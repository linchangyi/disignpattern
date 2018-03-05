package proxy.staticproxy;

import proxy.RealSubject;
import proxy.Subject;

/**
 * @author LinChangyi
 * @date 2018/2/27
 **/
public class StaticProxy implements Subject {

    private RealSubject subject;

    public StaticProxy(RealSubject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        //在调用目标对象方法之前，执行一些功能处理
        subject.request();
        //在调用目标对象方法之后，执行一些功能处理
    }
}
