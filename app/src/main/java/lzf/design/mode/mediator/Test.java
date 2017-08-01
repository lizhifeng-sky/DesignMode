package lzf.design.mode.mediator;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public class Test {
    public static void main(String[]args){
        AbstractMediator mediator=new Mediator();
        System.out.println("_________采购人员采购_____");
        Purchase purchase=new Purchase(mediator);
        purchase.buyIBMComputer(100);
        System.out.println("_________销售_____");
        Sale sale=new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("_________库存_____");
        Stock stock=new Stock(mediator);
        stock.clearStock();
    }
}
