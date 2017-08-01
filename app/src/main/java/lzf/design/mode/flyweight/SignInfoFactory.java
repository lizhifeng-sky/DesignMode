package lzf.design.mode.flyweight;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class SignInfoFactory {
    private static HashMap<String,SignInfo> pool=new HashMap<>();
    @Deprecated
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }
    public static SignInfo getSignInfo(String subject,String location){
        SignInfo result=null;
        if (!pool.containsKey(subject+location)){
            result=new SignInfoPool(subject+location);
            result.setSubject(subject);
            result.setLocation(location);
            pool.put(subject+location,result);
        }else {
            result=pool.get(subject+location);
        }
        return result;
    }
}
