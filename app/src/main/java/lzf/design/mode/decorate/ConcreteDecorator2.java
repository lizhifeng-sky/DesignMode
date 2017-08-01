package lzf.design.mode.decorate;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method(){
        System.out.println("ConcreteDecoration2 super在前 装饰类");
    }

    @Override
    public void operate() {
        super.operate();
        this.method();
    }
}
