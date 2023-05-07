package com.terminator.springcloudvault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Credential.class)
public class SpringCloudVaultApplication implements CommandLineRunner {

	@Autowired
	private  Credential credential;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudVaultApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------- APP INFO -----------");
		System.out.println(credential.getUsername());
		System.out.println(credential.getPassword());
	}
}
