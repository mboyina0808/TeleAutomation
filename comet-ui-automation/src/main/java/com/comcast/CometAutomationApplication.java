package com.comcast;

import com.comcast.scenarios.appds.RTTEL_665;
import org.junit.runner.JUnitCore;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CometAutomationApplication {

	@Bean
	public CommandLineRunner runner() {
        return args -> {
            JUnitCore jUnitCore = new JUnitCore();
                jUnitCore.run(RTTEL_665.class);

			SeleniumUtils.getDriver().close();


        };
}

	public static void main(String[] args) {
		SpringApplication.run(CometAutomationApplication.class, args);
	}
}
