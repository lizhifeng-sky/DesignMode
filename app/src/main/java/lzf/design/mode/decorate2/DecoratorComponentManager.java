package lzf.design.mode.decorate2;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class DecoratorComponentManager extends TestComponent {
    private TestComponent testComponent;
    public DecoratorComponentManager(TestComponent testComponent) {
        this.testComponent=testComponent;
    }

    @Override
    public void text() {
        testComponent.text();
        super.text();
    }
}
