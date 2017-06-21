package MyRestWS.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"MyRestWS.Controller","MyRestWS.Service"})
public class MyRestWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestWsApplication.class, args);
	}
}
