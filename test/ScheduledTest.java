/*
 * Copyright
 */
package test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Bao.f
 * @version V1.0
 */
public class ScheduledTest {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor e = new ScheduledThreadPoolExecutor(1);
        e.schedule(() -> System.out.println(666), 1, TimeUnit.SECONDS);
        e.submit(() -> System.out.println(777));
        ScheduledFuture<?> scheduledFuture = e.scheduleAtFixedRate(() -> System.out.println(888), 1, 2, TimeUnit.SECONDS);

        e.scheduleWithFixedDelay(() -> System.out.println(999), 1, 3, TimeUnit.SECONDS);
    }
}
