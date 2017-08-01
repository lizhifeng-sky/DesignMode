package lzf.design.mode.decorate;

import lzf.design.mode.decorate2.DecoratorComponent;
import lzf.design.mode.decorate2.TestComponent;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class Test {
    public static void main(String [] args){
        //抽象类+装饰者抽象类
//        Component component=new ConcreteComponent();
//        component=new ConcreteDecorator1(component);
//        component=new ConcreteDecorator2(component);
//        component.operate();
        //普通类
//        TestComponent testComponent=new TestComponent();
//        testComponent=new DecoratorComponent(testComponent);
//        testComponent.text();
        //抽象类
        Component component=new ConcreteComponent();
        component=new DecoratorCompent(component);
        component.operate();
    }
}
