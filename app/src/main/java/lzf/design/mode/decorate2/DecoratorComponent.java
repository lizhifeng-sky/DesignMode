package lzf.design.mode.decorate2;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class DecoratorComponent extends TestComponent{
    private TestComponent testComponent;
    public DecoratorComponent(TestComponent testComponent) {
        this.testComponent=testComponent;
    }
    @Override
    public void text() {
        method();
        super.text();
    }
    public void method(){
        System.out.println("额外的装饰");
    }
}
