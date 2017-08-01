package lzf.design.mode.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class BMWBuilder implements CarBuilder {
    private BMWModel bmwModel=new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwModel;
    }
}
