package dio.live.sdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SdiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdiscoveryApplication.class, args);
	}

}
