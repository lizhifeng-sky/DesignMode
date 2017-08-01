package lzf.design.mode.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public abstract class CarModel {
    private ArrayList<String> squence=new ArrayList<>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public void run(){
        for (int i = 0; i < this.squence.size(); i++) {
            String actionName=this.squence.get(i);
            if (actionName.equalsIgnoreCase("start")){
                this.start();
            }else if (actionName.equalsIgnoreCase("stop")){
                this.stop();
            }else if (actionName.equalsIgnoreCase("alarm")){
                this.alarm();
            }else if (actionName.equalsIgnoreCase("engineBoom")){
                this.engineBoom();
            }
        }
    }
    final public void setSequence(ArrayList<String> arrayList){
        this.squence=arrayList;
    }
}
