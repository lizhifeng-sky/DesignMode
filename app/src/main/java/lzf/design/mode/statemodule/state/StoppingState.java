package lzf.design.mode.statemodule.state;


import lzf.design.mode.statemodule.evolve.LiftState;
import lzf.design.mode.statemodule.evolve.LiftStateManager;

/**
 * Created by Administrator on 2017/6/2 0002.
 */
public class StoppingState extends LiftState {
    /*
    * 关门状态
    * */
    @Override
    public void open() {
        super.liftStateManager.setLiftState(LiftStateManager.openingState);
        super.liftStateManager.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门停止。。。。。不能关门");
        //todo nothing
    }

    @Override
    public void run() {
        super.liftStateManager.setLiftState(LiftStateManager.runningState);
        super.liftStateManager.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止啦...");
    }
}
