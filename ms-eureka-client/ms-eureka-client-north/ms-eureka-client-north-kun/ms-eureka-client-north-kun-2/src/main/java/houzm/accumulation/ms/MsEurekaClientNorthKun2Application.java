package houzm.accumulation.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsEurekaClientNorthKun2Application {

	public static void main(String[] args) {
		SpringApplication.run(MsEurekaClientNorthKun2Application.class, args);
	}
}
