package lzf.design.mode.proxy;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class Lawyer implements ILawsuit {
    private ILawsuit iLawsuit;
    public Lawyer(ILawsuit iLawsuit) {
        this.iLawsuit = iLawsuit;
    }
    @Override
    public void lawsuit() {
        iLawsuit.lawsuit();
    }
}
