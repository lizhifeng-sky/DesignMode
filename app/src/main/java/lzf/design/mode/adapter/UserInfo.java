package lzf.design.mode.adapter;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class UserInfo implements IUserInfo{
    private String string;
    public UserInfo(String string) {
        this.string = string;
    }
    @Override
    public String getUserName() {
        System.out.println(string+"getUserName");
        return string+"getUserName";
    }
    @Override
    public String getUserAddress() {
        System.out.println(string+"getUserAddress");
        return string+"getUserAddress";
    }
    @Override
    public String getMobileNumber() {
        System.out.println(string+"getMobileNumber");
        return string+"getMobileNumber";
    }
    @Override
    public String getHomeTelNumber() {
        System.out.println(string+"getHomeTelNumber");
        return string+"getHomeTelNumber";
    }
}
