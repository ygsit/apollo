package com.yu.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

import java.time.LocalDateTime;

public class GetApolloConfig {

    // VM options参数说明:
    //-Dapp.id=应用名称
    //-Denv=环境名称
    //‐Dapollo.cacheDir=缓存目录
    //-Dapollo.cluster=集群名称
    //-D环境_meta=meta地址

    //-Dapp.id=apollo-quickstart -Denv=DEV -Dapollo.cacheDir=/opt/data/ -Ddev_meta=http://localhost:8080
    /*public static void main(String[] args) {
        Config config = ConfigService.getAppConfig(); //读取默认namespace：application
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String property = config.getProperty("sms.enable", null);
            System.out.printf("now: %s, sms.enable: %s%n", LocalDateTime.now().toString(), property);
        }
    }*/


    //-Dapp.id=account-service -Denv=DEV -Dapollo.cacheDir=/opt/data/ -Dapollo.cluster=SHAJQ -Ddev_meta=http://localhost:8080
    public static void main(String[] args) {
//        Config config = ConfigService.getAppConfig(); //读取默认namespace：application
//        Config config = ConfigService.getConfig("spring-rocketmq"); //读取指定namespace
        Config config = ConfigService.getConfig("micro_service.springboot-common"); //读取指定公共namespace
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String property = config.getProperty("server.servlet.context‐path", null);
            System.out.printf("now: %s, server.servlet.context‐path: %s%n", LocalDateTime.now().toString(), property);
        }
    }

}
