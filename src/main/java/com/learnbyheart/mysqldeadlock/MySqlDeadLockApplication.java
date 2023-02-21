package com.learnbyheart.mysqldeadlock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySqlDeadLockApplication {
    /**
     * 模拟数据库死锁并总结
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(MySqlDeadLockApplication.class, args);
    }

}
