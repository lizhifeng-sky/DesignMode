package lzf.design.mode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;//被代理类的引用

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }
}
