package lzf.design.mode.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
public class BenzBuilder implements CarBuilder {
    BenzModel benzModel=new BenzModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
