package houzm.accumulation.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsEurekaServerSouthApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEurekaServerSouthApplication.class, args);
	}
}
