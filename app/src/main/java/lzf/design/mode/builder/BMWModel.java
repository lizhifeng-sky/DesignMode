package lzf.design.mode.builder;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println(this.getClass().getName()+"start");
    }

    @Override
    protected void stop() {
        System.out.println(this.getClass().getName()+"stop");
    }

    @Override
    protected void alarm() {
        System.out.println(this.getClass().getName()+"alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println(this.getClass().getName()+"engineBoom");
    }
}
