package lzf.design.mode.commond;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public abstract class Command {
    protected CodeGroup codeGroup=new CodeGroup();
    protected UiGroup uiGroup=new UiGroup();
    protected RequirementGroup requirementGroup=new RequirementGroup();
    public abstract void execute();
}
