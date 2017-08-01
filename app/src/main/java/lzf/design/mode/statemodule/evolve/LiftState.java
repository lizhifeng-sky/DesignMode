package lzf.design.mode.statemodule.evolve;

import lzf.design.mode.statemodule.ILift;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public abstract class LiftState implements ILift{
    protected LiftStateManager liftStateManager;
    public void setLiftStateManager(LiftStateManager liftStateManager) {
        this.liftStateManager = liftStateManager;
    }
}
