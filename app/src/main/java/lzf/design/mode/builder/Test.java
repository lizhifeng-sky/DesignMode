package lzf.design.mode.builder;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class Test {
    public static void main(String[]args){
        Director director=new Director();
        director.getBenzModel().run();
        director.getBMWModel().run();
    }
}
