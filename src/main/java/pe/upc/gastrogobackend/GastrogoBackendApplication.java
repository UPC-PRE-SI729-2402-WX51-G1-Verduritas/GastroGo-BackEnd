package pe.upc.gastrogobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GastrogoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(GastrogoBackendApplication.class, args);
	}

}
