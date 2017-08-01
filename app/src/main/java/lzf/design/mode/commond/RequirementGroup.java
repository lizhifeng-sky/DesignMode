package lzf.design.mode.commond;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class RequirementGroup implements Group {
    @Override
    public void find() {
        System.out.println("find");
    }

    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void change() {
        System.out.println("change");
    }

    @Override
    public void plan() {
        System.out.println("plan");
    }
}
