package lzf.design.mode.strategy;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class CalculateManager{
    CalculateStrategy strategy;
    public void setStrategy(CalculateStrategy strategy){
        this.strategy=strategy;
    }
    public int calculatePrice(int km){
        return strategy.calculatePrice(km);
    }
}
