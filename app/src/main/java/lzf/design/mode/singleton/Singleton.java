package lzf.design.mode.singleton;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class Singleton{
    private Singleton(){}
    public static Singleton getInstance(){
        return SingletonHelper.instance;
    }
    private static class SingletonHelper{
        private static final Singleton instance=new Singleton();
    }
}
