package lzf.design.mode.commond;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class UiGroup implements Group {
    @Override
    public void find() {
        System.out.println("ui"+"  find");
    }

    @Override
    public void add() {
        System.out.println("ui"+"  add");
    }

    @Override
    public void delete() {
        System.out.println("ui"+"  delete");
    }

    @Override
    public void change() {
        System.out.println("ui"+"  change");
    }

    @Override
    public void plan() {
        System.out.println("ui"+"  plan");
    }
}
