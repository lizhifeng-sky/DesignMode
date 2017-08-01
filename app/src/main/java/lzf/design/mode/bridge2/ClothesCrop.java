package lzf.design.mode.bridge2;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class ClothesCrop extends Crop {
    @Override
    protected void produce() {
        System.out.println("生产衣服");
    }
    @Override
    protected void sell() {
        System.out.println("卖衣服");
    }
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("买衣服赚钱啦");
    }
}
