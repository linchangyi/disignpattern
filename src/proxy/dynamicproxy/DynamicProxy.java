package proxy.dynamicproxy;

import proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author LinChangyi
 * @date 2018/2/27
 **/
public class DynamicProxy implements InvocationHandler{

    private Subject subject;

    public Subject getInstance(Subject subject) {
        this.subject =  subject;
        return (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在调用目标对象方法之前，执行一些功能处理
        return method.invoke(proxy, args);
        //在调用目标对象方法之后，执行一些功能处理
    }
}
