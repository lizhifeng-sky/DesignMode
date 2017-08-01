package lzf.design.mode.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class Director {
    private ArrayList<String> sequence=new ArrayList<>();
    private BenzBuilder benzBuilder=new BenzBuilder();
    private BMWBuilder bmwBuilder=new BMWBuilder();
    public BenzModel getBenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
    public BMWModel getBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
}
