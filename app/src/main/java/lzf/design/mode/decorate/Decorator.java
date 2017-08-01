package lzf.design.mode.decorate;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public abstract class Decorator extends Component {

    private Component component=null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
