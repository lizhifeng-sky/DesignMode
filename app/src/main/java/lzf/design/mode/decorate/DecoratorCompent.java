package lzf.design.mode.decorate;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class DecoratorCompent extends Component {
    private Component component;
    public DecoratorCompent(Component component) {
        this.component = component;
    }
    @Override
    public void operate() {
        method();
        this.component.operate();
    }
    private void method(){
        System.out.println("ConcreteDecoration2 super在前 装饰类");
    }
}
