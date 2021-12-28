/*
 * Copyright
 */
package test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Bao.f
 * @version V1.0
 */
public class Sao {
    public static void main(String[] args) {
//        out:
//        for (;;){
//            System.out.println("outer");
//            for (; ; ) {
//                System.out.println("inner");
//                break out;
//            }
//        }
//        t1(args);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,60, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>());
        executor.execute(()->{
            int i = 1 / 0;
        });
        executor.execute(()->{
            int i = 1 / 0;
        });

        System.out.println("end");
    }
    public static void t1(String[] args){

        out:
        if (1==1) {
            System.out.println(1);
            if (args.length ==  0) {
                return;
            }else {
                break out;
            }
        }
        System.out.println(2);
    }
}
