package lzf.design.mode.strategy;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class Test {
    public static void main(String[] args){
        CalculateManager calculateManager=new CalculateManager();
        calculateManager.setStrategy(new BusStrategy());
        System.out.println("公交"+calculateManager.calculatePrice(16));
    }
}
