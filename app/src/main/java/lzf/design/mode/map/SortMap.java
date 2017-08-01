package lzf.design.mode.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/4/25 0025.
 */

public class SortMap {
    public static void main(String [] args){
        HashMap<Integer,UserInfo> hashMap=new HashMap<>();
        hashMap.put(1,new UserInfo(25,"张三"));
        hashMap.put(4,new UserInfo(20,"李四"));
        hashMap.put(2,new UserInfo(16,"王五"));
        hashMap.put(3,new UserInfo(30,"赵六"));
        System.out.println(hashMap);
        HashMap<Integer,UserInfo> sortHashMap = sortMap(hashMap);
        System.out.println(sortHashMap);
    }
    private static HashMap<Integer,UserInfo> sortMap(HashMap<Integer, UserInfo> map){
        Set<Map.Entry<Integer,UserInfo>> set=map.entrySet();
        List<Map.Entry<Integer,UserInfo>> list=new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Integer, UserInfo>>() {
            @Override
            public int compare(Map.Entry<Integer, UserInfo> o1, Map.Entry<Integer, UserInfo> o2) {
                return o1.getValue().getAge()-o2.getValue().getAge();
            }
        });
        LinkedHashMap<Integer,UserInfo> linkedHashMap=new LinkedHashMap<>();
        for (Map.Entry<Integer,UserInfo> entry:list) {
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;
    }
}
