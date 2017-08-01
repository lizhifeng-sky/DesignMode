package lzf.design.mode.template;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public class MyCar extends CarModel {

    @Override
    protected void method1() {
        System.out.println("method1");
    }

    @Override
    protected void method2() {
        System.out.println("method2");
    }

    @Override
    protected boolean canDo() {
        return super.canDo();
    }
}
