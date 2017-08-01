package lzf.design.mode.flyweight;

/**
 * Created by Administrator on 2017/7/31 0031.
 */
public class Test {
    public static void main(String[] args){
//        SignInfo signInfo=SignInfoFactory.getSignInfo();
        for (int i = 0; i < 4; i++) {
            String subject="科目"+i;
            for (int j = 0; j < 30; j++) {
                String location="考试地点"+j;
                SignInfoFactory.getSignInfo(subject,location);
            }
        }
        for (int i = 0; i < 5; i++) {
            final int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    SignInfo signInfo1=SignInfoFactory.getSignInfo("科目1","考试地点1");
                    signInfo1.setId(finalI +"");
                    System.out.println(signInfo1.hashCode()+"   "+signInfo1.toString());
                }
            }).start();
        }

    }
}
