package steam.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import restConsumer.PlayerConsumer;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		PlayerConsumer playerConsumer = new PlayerConsumer();
		playerConsumer.consume("76561198025312813");
	}
}
