package lzf.design.mode.mediator;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")){
            this.buyComputer((Integer) objects[0]);
        }else if (str.equals("sale.sell")){
            this.sellComputer((Integer) objects[0]);
        }else if (str.equals("sale.offsell")){
            this.offSell();
        }else if (str.equals("stock.clear")){
            this.clearStock();
        }
    }
    private void buyComputer(int number){
        int saleStatus=super.sale.getSaleStatus();
        if (saleStatus>80){
            System.out.println("可以采购IBM 销售状况良好");
            super.stock.increase(number);
        }else {
            int buyNumber=number/2;
            System.out.println("采购消减 销售状况不好 "+buyNumber);
        }
    }
    private void sellComputer(int number){
        if (super.stock.getStockNumber()<number){
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell(){
        System.out.println("折价销售");
    }

    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
