package lzf.design.mode.bridge;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class HouseCorp extends Crop {

    public HouseCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("卖房子，赚大了");
    }
}
