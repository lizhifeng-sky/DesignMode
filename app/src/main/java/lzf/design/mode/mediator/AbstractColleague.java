package lzf.design.mode.mediator;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
