package com.czc.web.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by shiqian on 2018-04-27
 */
@Component
@Order(value = 2)
public class TestCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("在这里执行加载数据的操作");
    }
}
