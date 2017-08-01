package lzf.design.mode.mediator;

import java.util.Random;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
/*
* 销售
* */
public class Sale extends AbstractColleague{
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }
    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell",number);
        System.out.println("销售IBM电脑"+number);
    }
    public int getSaleStatus(){
        Random random=new Random(System.currentTimeMillis());
        int saleStatus=random.nextInt(100);
        System.out.println("IBM电脑的销售情况为"+saleStatus);
        return saleStatus;
    }
    public void offSale(){
        super.mediator.execute("sale.offsell");
    }
}
