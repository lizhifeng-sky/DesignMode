package lzf.design.mode.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class Test {
    public static void main(String[] args){
//        静态代理
//        ILawsuit lawsuit=new People();
//        ILawsuit lawyer=new Lawyer(lawsuit);
//        lawyer.lawsuit();
//        lawyer.burden();
//        lawyer.defend();
//        lawyer.finish();
        //动态代理
        ILawsuit iLawsuit=new People();
        DynamicProxy proxy=new DynamicProxy(iLawsuit);
        ClassLoader loader=iLawsuit.getClass().getClassLoader();
        ILawsuit lawsuit= (ILawsuit) Proxy.newProxyInstance(loader,new Class[]{ILawsuit.class},proxy);
        lawsuit.lawsuit();
//        lawsuit.submit();
//        lawsuit.burden();
//        lawsuit.defend();
//        lawsuit.finish();

    }
}
