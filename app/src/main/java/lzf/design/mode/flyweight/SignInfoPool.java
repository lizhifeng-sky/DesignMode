package lzf.design.mode.flyweight;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class SignInfoPool extends SignInfo {
    private String key;

    public SignInfoPool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
