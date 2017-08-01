package lzf.design.mode.commond;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class Test {
    public static void main(String[] args){
        Group group=new RequirementGroup();
        group.find();
        group.add();
        group.plan();

        Invoker invoker=new Invoker();
        AddRequirementCommand addRequirementCommand=new AddRequirementCommand();
        invoker.setCommand(addRequirementCommand);
        invoker.action();
    }
}
