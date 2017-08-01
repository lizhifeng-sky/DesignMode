package lzf.design.mode.observer;

import java.util.Observable;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class Code extends Observable {
    public void postAction(String content){
        setChanged();
        notifyObservers(content);
    }
}
