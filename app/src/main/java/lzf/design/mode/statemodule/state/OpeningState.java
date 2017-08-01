package lzf.design.mode.statemodule.state;

import lzf.design.mode.statemodule.Context;
import lzf.design.mode.statemodule.evolve.LiftState;
import lzf.design.mode.statemodule.evolve.LiftStateManager;

/**
 * Created by Administrator on 2017/6/2 0002.
 */
public class OpeningState extends LiftState {
    /*
    * 开启状态
    * */
    @Override
    public void open() {
        System.out.println("电梯门开启。。。。。");
    }

    @Override
    public void close() {
        //状态修改
        super.liftStateManager.setLiftState(LiftStateManager.closingState);
        //动作委托为CloseState来执行
        super.liftStateManager.getLiftState().close();
    }

    @Override
    public void run() {
        System.out.println("电梯门开启。。。。。不能运行");
        //todo nothing
    }

    @Override
    public void stop() {
        System.out.println("电梯门开启。。。。。不能停止");
        //todo nothing
    }
}
