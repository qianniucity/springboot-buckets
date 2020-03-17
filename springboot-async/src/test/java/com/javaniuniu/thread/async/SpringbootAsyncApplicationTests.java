package com.javaniuniu.thread.async;

import com.javaniuniu.thread.async.service.AsyncTask;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootAsyncApplicationTests {

    @Autowired
    private AsyncTask asyncTask;

    @Test
    public void testAsync() throws InterruptedException, ExecutionException {
        asyncTask.dealNoReturnTask();

        Future<String> future = asyncTask.dealHaveReturnTask(5);
        log.info("主线程执行finished");
        log.info(future.get());
        assertThat(future.get(), is("success:" + 5));
    }

    @Test
    void contextLoads() {
    }

}
