package lzf.design.mode.statemodule;

/**
 * Created by Administrator on 2017/6/21 0021.
 */
public interface ILift {
     void open();//首先电梯门开启动作
     void close();//电梯门有开启 当然也有关闭
     void run();//电梯要能上能下 运行起来
     void stop();  //电梯还要能停下来
}
