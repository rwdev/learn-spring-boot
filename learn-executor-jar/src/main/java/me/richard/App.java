package me.richard;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Scheduled(fixedRate = 1000)
	public void tick() {
		String currentSecond = LocalDateTime.now().toString();
		for (int i = 0; i < 1000000; i++) {			
			System.out.println(currentSecond);
		}
	}

}
