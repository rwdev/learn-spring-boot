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
		for (int i = 0; i < 10000; i++) {
			String currentSecond = LocalDateTime.now().toString();
			System.out.println(currentSecond);
		}
	}

}
