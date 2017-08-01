package lzf.design.mode.decorate;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something 原实现类");
    }
}
