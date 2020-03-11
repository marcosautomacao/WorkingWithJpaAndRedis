package br.java_project.spring_project_ddd;

import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication // that is @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

	public static void main(String[] args) {
		FakeBanco.getAlunos();

		SpringApplication.run(Application.class, args);

	}
}
