package lzf.design.mode;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    private Timer mTimer;
    private int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init timer
        mTimer = new Timer();
        // start timer task
        setTimerTask();
        ScheduleThreadPoolManager.getInstance().startTiming(new Runnable() {
            @Override
            public void run() {

            }
        },1,3);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // cancel timer
        mTimer.cancel();
    }

    private void setTimerTask() {
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                Message message = new Message();
                message.what = 1;
                doActionHandler.sendMessage(message);
            }
        }, 1000, 1000/* 表示1000毫秒之後，每隔1000毫秒執行一次 */);
    }

    /**
     * do some action
     */
    private Handler doActionHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int msgId = msg.what;
            switch (msgId) {
                case 1:
                    count++;
                    thread.start();
//                    Log.e("lzf_time",count+" ");
                    // do some action
                    break;
                default:
                    break;
            }
        }
    };
    private Thread thread=new Thread(new Runnable() {
        @Override
        public void run() {
            Log.e("lzf_time",count+" ");
        }
    });
}
