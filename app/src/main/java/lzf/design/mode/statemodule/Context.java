package lzf.design.mode.statemodule;

import lzf.design.mode.statemodule.state.ClosingState;
import lzf.design.mode.statemodule.state.OpeningState;
import lzf.design.mode.statemodule.state.RunningState;
import lzf.design.mode.statemodule.state.StoppingState;

/**
 * Created by Administrator on 2017/6/2 0002.
 */
public class Context {
    //定义出所有的电梯状态
    public final static OpeningState openingState=new OpeningState();
    public final static ClosingState closingState=new ClosingState();
    public final static RunningState runningState=new RunningState();
    public final static StoppingState stoppingState=new StoppingState();
    //定义一个当前电梯状态
    private LiftState liftState;
    public LiftState getLiftState(){
        return liftState;
    }
    public void setLiftState(LiftState liftState){
        this.liftState=liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }

}
