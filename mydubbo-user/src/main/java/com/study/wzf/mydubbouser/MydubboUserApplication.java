package com.study.wzf.mydubbouser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class MydubboUserApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(MydubboUserApplication.class, args);

//        String env = ac.getEnvironment().getProperty("");
        while (true){
            String info = ac.getEnvironment().getProperty("info");
            System.out.println("main:"+info);

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}


