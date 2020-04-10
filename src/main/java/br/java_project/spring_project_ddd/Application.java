package br.java_project.spring_project_ddd;

import br.java_project.spring_project_ddd.domain.application.FirstLoad;
import br.java_project.spring_project_ddd.domain.interfaces.StudentService;
import br.java_project.spring_project_ddd.infrastructure.AlunoRepository;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication // that is @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

    private final StudentService studentService;

    public Application(StudentService studentService) {
        this.studentService = studentService;
    }


	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("Atualizando a base:");
		
			if (studentService.find().isEmpty()){
				FirstLoad.run();
			}
		};
	};
}
