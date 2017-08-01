package lzf.design.mode.commond;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
