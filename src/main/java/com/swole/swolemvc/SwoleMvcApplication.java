package com.swole.swolemvc;

import com.swole.swolemvc.storage.StorageProperties;
import com.swole.swolemvc.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class SwoleMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwoleMvcApplication.class, args);
	}
	//@Bean
	//CommandLineRunner init(StorageService storageService){
	//	return (args) -> {
	//		storageService.deleteAll();
	//		storageService.init();
	//	};
	//}
}
