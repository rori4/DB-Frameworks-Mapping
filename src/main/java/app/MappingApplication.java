package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import repository.builder.lib.ANSRBuilder;
import repository.builder.lib.enums.interfaces.Strategy;

@SpringBootApplication
public class MappingApplication {

	public static void main(String[] args) {
//		ANSRBuilder.run(Strategy.REPOSITORIES_AND_SERVICES(),MappingApplication.class, args);
		SpringApplication.run(TerminalController.class, args);
	}
}
