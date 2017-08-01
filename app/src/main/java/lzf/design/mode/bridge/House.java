package lzf.design.mode.bridge;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public class House extends Product {
    @Override
    public void beProduct() {
        System.out.println("生产出的房子是这样的。。。。");
    }
    @Override
    public void beSell() {
        System.out.println("生产出的房子卖出去了。。。。");
    }
}
