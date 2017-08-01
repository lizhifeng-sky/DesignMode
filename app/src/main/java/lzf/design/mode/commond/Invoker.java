package lzf.design.mode.commond;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }
}
