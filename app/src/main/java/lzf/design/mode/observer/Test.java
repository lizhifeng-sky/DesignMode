package lzf.design.mode.observer;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class Test {
    public static void main(String[] args){
        //观察者
        Coder coder=new Coder("bug");
        //被观察者
        Code code=new Code();
        code.addObserver(coder);
        code.postAction("update");
    }
}
