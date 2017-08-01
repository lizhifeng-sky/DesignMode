package lzf.design.mode.bridge2;

import lzf.design.mode.bridge.House;
import lzf.design.mode.bridge.HouseCorp;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class Test {
    public static void main(String[] args){
        ClothesCrop crop=new ClothesCrop();
        crop.makeMoney();
        HouseCorp houseCorp=new HouseCorp(new House());
        houseCorp.makeMoney();
    }
}
