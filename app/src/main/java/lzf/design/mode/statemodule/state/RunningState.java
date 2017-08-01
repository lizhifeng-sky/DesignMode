package lzf.design.mode.statemodule.state;


import lzf.design.mode.statemodule.evolve.LiftState;
import lzf.design.mode.statemodule.evolve.LiftStateManager;

/**
 * Created by Administrator on 2017/6/2 0002.
 */
public class RunningState extends LiftState {
    /*
    * 运行
    * */
    @Override
    public void open() {
        //todo nothing
        System.out.println("电梯运行中。。。。。不能开门");
    }

    @Override
    public void close() {
        System.out.println("电梯运行中。。。。。不能关门");
        //todo nothing
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行。。。");
    }

    @Override
    public void stop() {
        super.liftStateManager.setLiftState(LiftStateManager.stoppingState);
        super.liftStateManager.getLiftState().stop();
    }
}
