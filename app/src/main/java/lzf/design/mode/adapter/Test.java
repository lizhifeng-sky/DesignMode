package lzf.design.mode.adapter;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class Test {
    public static void main(String[] args){
//        IUserInfo iUserInfo=new UserInfo("我是自己人");
//        iUserInfo.getHomeTelNumber();
        IUserInfo iUserInfo=new UserAdapter("我是外来人");
        iUserInfo.getHomeTelNumber();
    }
}
