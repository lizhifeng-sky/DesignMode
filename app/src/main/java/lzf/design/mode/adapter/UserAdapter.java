package lzf.design.mode.adapter;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class UserAdapter extends OutUserInfo implements IUserInfo {
    private String baseUserInfo;
    public UserAdapter(String string) {
        super(string);
        baseUserInfo=super.getUserBaseInfo();
    }
    @Override
    public String getUserName() {
        return baseUserInfo;
    }
    @Override
    public String getUserAddress() {
        return baseUserInfo;
    }
    @Override
    public String getMobileNumber() {
        return baseUserInfo;
    }
    @Override
    public String getHomeTelNumber() {
        return baseUserInfo;
    }
}
