package CreationPatterns.Singleton;

import org.junit.Test;
import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *     test the performance of {@code ThreadSafeLazyInit} Singleton Pattern
 *     vs {@code DoubleCheckedLockingInit} Singleton Pattern
 *
 *     The result is unexpected.
 *     These two method doesn't have much difference in multi-thread running
 *     22218471697
 *     26169731286
 */
public class PerformanceTest {

    @Test
    public void testThreadSafe() throws InterruptedException {
        runIt(ThreadSafeLazyInit::getInstance);
    }

    @Test
    public void testDoubleCheck() throws InterruptedException {
        runIt(DoubleCheckedLockingInit::getInstance);
    }

    private void runIt(final Runnable r) throws InterruptedException {
        // thread pools for testing
        ExecutorService executor = Executors.newFixedThreadPool(1000);

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for (int i = 0; i < 100000000; i++) {
                executor.execute(r);
        }

        executor.shutdown();

        stopWatch.stop();
        System.out.println("Run time is: " + stopWatch.getNanoTime());
    }
}
