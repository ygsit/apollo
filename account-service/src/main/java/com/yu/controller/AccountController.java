package com.yu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@Value("${sms.enable}")
	private Boolean smsEnable;

	@Value("${server.servlet.context‐path}")
	private String contextPath;

	@Value("${spring.datasource.url}")
	private String druidConfig;

	@GetMapping("/common")
	public String common() {
		return "common：" + contextPath;
	}

	@GetMapping("/druid")
	public String druid() {
		return "druidConfig：" + druidConfig;
	}

	@GetMapping("/sms")
	public String getSmsConfig() {
		return "smsEnable: " + smsEnable;
	}

	@Value("${rocketmq.name-server}")
	private String mqNameServer;

	@Value("${rocketmq.producer.group}")
	private String mqProducerGroup;

	@GetMapping("/mq")
	public String getRocketMQConf() {
		return mqNameServer + ": " + mqProducerGroup;
	}

	@Value("${timeout}")
	private Long timeout;

	@GetMapping("/timeout")
	public Long getTimeout() {
		return timeout;
	}

	@GetMapping("/db-url")
	public String getDBConfig(@Value("${spring.datasource.url}") String url) {
		return url;
	}

}
