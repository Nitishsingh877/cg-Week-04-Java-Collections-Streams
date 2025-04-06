package com.nitish.reflection.advancedlevel;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Greeting {
    void sayHello();
}
class Hello implements Greeting{
    @Override
    public void sayHello() {
        System.out.println("hello bhai");
    }
}

class CustomInvocationHandler implements InvocationHandler {
    private final Object target;

    public CustomInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method call");
        Object result = method.invoke(target,args);
        System.out.println("after method call");
        return result;
    }
}
public class CustomLoggingProxy {
    public static void main(String[] args) {
        Greeting original = new Hello();

        //proxy instance
        Greeting proxyInsatnce = (Greeting) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),
                new  Class[] {Greeting.class},
                new CustomInvocationHandler(original)
        );

        proxyInsatnce.sayHello();
    }

}
