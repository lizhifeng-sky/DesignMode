package lzf.design.mode.statemodule.evolve;

import lzf.design.mode.statemodule.ILift;
import lzf.design.mode.statemodule.state.ClosingState;
import lzf.design.mode.statemodule.state.OpeningState;
import lzf.design.mode.statemodule.state.RunningState;
import lzf.design.mode.statemodule.state.StoppingState;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class LiftStateManager implements ILift {
    //定义出所有的电梯状态
    public final static OpeningState openingState=new OpeningState();
    public final static ClosingState closingState=new ClosingState();
    public final static RunningState runningState=new RunningState();
    public final static StoppingState stoppingState=new StoppingState();
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        liftState.setLiftStateManager(this);
    }
    @Override
    public void open() {
        this.liftState.open();
    }
    @Override
    public void close() {
        this.liftState.close();
    }
    @Override
    public void run() {
        this.liftState.run();
    }
    @Override
    public void stop() {
        this.liftState.stop();
    }
}
