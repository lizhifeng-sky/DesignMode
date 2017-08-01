package lzf.design.mode.bridge2;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public abstract class Crop {
    protected abstract void produce();
    protected abstract void sell();
    public void makeMoney(){
        this.produce();
        this.sell();
    }
}
