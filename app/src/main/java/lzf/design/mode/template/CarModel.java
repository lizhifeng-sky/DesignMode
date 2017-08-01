package lzf.design.mode.template;

/**
 * Created by Administrator on 2017/4/14 0014.
 */
public abstract class CarModel {
    protected abstract void method1();
    protected abstract void method2();
    protected  boolean canDo(){
     return true;
    }
    final public void start(){
       this.method1();
        if (this.canDo()) {
            this.method2();
        }
    }
}
