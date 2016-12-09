package com.cynaptec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringcloudM3TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM3TaskApplication.class, args);
	}
	
	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}
	
	public class TollProcessingTask implements CommandLineRunner {

		@Override
		public void run(String... strings) throws Exception {
			// parameters stationId, licence plate, timestamp
			if (null != strings) {
				System.out.println("Parameter length is " + strings.length);
				
				String arg0 = (strings.length > 0) ? strings[0] : "?";
				String stationId = (strings.length > 1) ? strings[1] : "?";
				String licensePlate = (strings.length > 2) ? strings[2] : "?";
				String timestamp = (strings.length > 3) ? strings[3] : "?";
				
				System.out.println("arg0 is " + arg0 + ", Station ID is " + stationId + ", plate is " + licensePlate + ", timestamp is " + timestamp);
			}
			
		}
	}
}
