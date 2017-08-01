package lzf.design.mode.bridge;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public abstract class Crop {
    private Product product;

    public Crop(Product product) {
        this.product = product;
    }
    public void makeMoney(){
        this.product.beProduct();
        this.product.beSell();
    }
}
