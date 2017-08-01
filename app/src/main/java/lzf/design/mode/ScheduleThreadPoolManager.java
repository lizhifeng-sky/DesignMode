package lzf.design.mode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/6/6 0006.
 */
public class ScheduleThreadPoolManager {
    /*
    * 定长线程池 定时任务
    * */
    private static ScheduledExecutorService scheduledExecutorService;
    /*
    * 可缓存线程池
    * 线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程
    * */
    private static ExecutorService cachedThreadPool;
    /*
    * 定长线程池 可控制线程最大并发数，超出的线程会在队列中等待
    * */
    private static ExecutorService fixedThreadPool;
    /*
    * 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
    * */
    private static ExecutorService singleThreadExecutor ;

    /*
    * 简单的单利
    * */
    private static ScheduleThreadPoolManager scheduleThreadPoolManager=new ScheduleThreadPoolManager();

    public static ScheduleThreadPoolManager getInstance() {
        return scheduleThreadPoolManager;
    }
    private ScheduleThreadPoolManager() {
    }
    /**
     * @author lzf
     * create at 2017/6/6 0006 18:49
     * description 执行定时任务 表示延迟 @param initialDelay秒后 每 @param period秒执行一次
     * @param command runnable
     * @param initialDelay 延时执行时间 s
     * @param period 多久执行一次
     */
    public void startTiming(Runnable command,
                      long initialDelay,
                      long period){
        if (scheduledExecutorService==null){
            scheduledExecutorService = Executors.newScheduledThreadPool(5);
        }
        scheduledExecutorService.scheduleAtFixedRate(command,initialDelay,period, TimeUnit.SECONDS);
    }
    /**
     * @author lzf
     * create at 2017/6/6 0006 18:52
     * description 执行定时任务 延迟 @param initialDelay秒执行
     * @param command runnable
     * @param initialDelay 多久执行一次
     */
    public void startTimingWithoutDelay(
            Runnable command,
            long initialDelay){
        if (scheduledExecutorService==null){
            scheduledExecutorService = Executors.newScheduledThreadPool(5);
        }
        scheduledExecutorService.schedule(command,initialDelay,TimeUnit.SECONDS);
    }
    /**
     * @author lzf
     * create at 2017/6/6 0006 19:00
     * description 可缓存线程池
     * @param runnable
     */
    public void startCache(Runnable runnable){
        if (cachedThreadPool==null){
            cachedThreadPool= Executors.newCachedThreadPool();
        }
        cachedThreadPool.execute(runnable);
    }
    /**
     * @author lzf
     * create at 2017/6/6 0006 19:03
     * description 定长线程池
     * @param runnable
     */
    public void startFixed(Runnable runnable){
        if (fixedThreadPool==null) {
            fixedThreadPool=Executors.newFixedThreadPool(5);
        }
            fixedThreadPool.execute(runnable);
    }
    /**
     * @author lzf
     * create at 2017/6/6 0006 19:03
     * description 单线程线程池
     * @param runnable
     */
    public void startSingle(Runnable runnable){
        if (singleThreadExecutor==null){
            singleThreadExecutor = Executors.newSingleThreadExecutor();
        }
        singleThreadExecutor.execute(runnable);
    }
}
