package lzf.design.mode.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class Coder implements Observer {
    private String action;

    public Coder(String action) {
        this.action = action;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(action+arg);
    }
}
