package lzf.design.mode.strategy;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class BusStrategy implements CalculateStrategy {
    @Override
    public int calculatePrice(int km) {
        return 10;
    }
}
