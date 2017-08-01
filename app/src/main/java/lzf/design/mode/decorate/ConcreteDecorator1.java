package lzf.design.mode.decorate;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    private void method(){
        System.out.println("ConcreteDecorator1 super在后 装饰类");
    }
    @Override
    public void operate() {
        this.method();
        super.operate();
    }
}
