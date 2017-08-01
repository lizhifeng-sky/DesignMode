package lzf.design.mode.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/4/12 0012.
 */
interface CarBuilder {
    void setSequence(ArrayList<String> sequence);
    CarModel getCarModel();
}
