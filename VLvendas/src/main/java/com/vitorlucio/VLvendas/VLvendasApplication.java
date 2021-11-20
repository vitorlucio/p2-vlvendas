package com.vitorlucio.VLvendas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class VLvendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(VLvendasApplication.class, args);
	}

}
