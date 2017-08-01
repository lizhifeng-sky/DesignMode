package lzf.design.mode.proxy;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class People implements ILawsuit {
    @Override
    public void lawsuit() {
        System.out.println("我要上诉");
    }
}
