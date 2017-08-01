package lzf.design.mode.mediator;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
/*
* 采购者
* */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }
    public void buyIBMComputer(int number){
        super.mediator.execute("purchase.buy",number);
    }
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }
}
