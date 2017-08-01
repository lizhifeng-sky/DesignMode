package lzf.design.mode.adapter;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class OutUserInfo implements IOutUser {
    private String string;
    public OutUserInfo(String string) {
        this.string = string;
    }
    @Override
    public String getUserBaseInfo() {
        System.out.println(string);
        return string;
    }
}
