package com.app.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class AppRunner implements ApplicationRunner {
	@Value("${my.data}")
	private String myData;
	@Value("${message}")
	private String message;

	@Override
	public String toString() {
		return "AppRunner [myData=" + myData + ", message=" + message + "]";
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(this);

	}

}
