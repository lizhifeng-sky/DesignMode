package lzf.design.mode.statemodule;

import lzf.design.mode.statemodule.evolve.LiftStateManager;
import lzf.design.mode.statemodule.state.ClosingState;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public class Test {
    public static void main(String[] args){
//        Context context=new Context();
//        context.setLiftState(new ClosingState());
//        context.run();
//        context.open();
//        context.stop();
        LiftStateManager liftStateManager=new LiftStateManager();
        liftStateManager.setLiftState(new ClosingState());
        liftStateManager.open();
        liftStateManager.run();
        liftStateManager.open();
        liftStateManager.stop();
    }
}
