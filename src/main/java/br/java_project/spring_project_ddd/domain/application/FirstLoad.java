package br.java_project.spring_project_ddd.domain.application;

import br.java_project.spring_project_ddd.FakeBanco;
import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;
import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import br.java_project.spring_project_ddd.infrastructure.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public final class FirstLoad {
	
	@Autowired
	static
    AlunoRepository alunoRepository;

    public static void run() {
        try {
            File myObj = new File("src/main/resources/lista_alunos.txt");
            Scanner myReader = new Scanner(myObj);
            List linhas = new ArrayList<>();
            while (myReader.hasNextLine()) {

                String data = myReader.nextLine();
                linhas = Arrays.asList(data.split("[ ]{2,}"));

                if (linhas.size() > 1) {
                    double matricula = Double.parseDouble(linhas.get(1).toString().replaceAll("[^\\d.]", ""));
                    AlunoEntity alunoEntity = new AlunoEntity(linhas.get(0).toString(), matricula);
                                       
                    alunoRepository.save(alunoEntity);
                }
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
