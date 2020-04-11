package br.java_project.spring_project_ddd.domain.application;

import br.java_project.spring_project_ddd.FakeBanco;

import br.java_project.spring_project_ddd.domain.interfaces.StudentService;
import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;
import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import br.java_project.spring_project_ddd.infrastructure.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
    AlunoRepository alunoRepository;
	
	@Override
    public List<AlunoDTO> find() {

        List<AlunoDTO> alunos = new ArrayList<AlunoDTO>();
        
        alunoRepository.findAll().forEach(a -> alunos.add(new AlunoDTO(a)));
        
        return alunos;
    }

    @Override
    public AlunoDTO findByOne(int id) {

    	AlunoEntity alunoEntity = alunoRepository.findById(id).get();

        return new AlunoDTO(alunoEntity);
    }

    @Override
    public AlunoDTO postStudent(AlunoDTO aluno) {
    	
        AlunoEntity alunoEntity = new AlunoEntity(aluno);
        
        try {
        alunoRepository.save(alunoEntity);
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
        }
        
        return new AlunoDTO(alunoRepository.save(alunoEntity));
    }

    @Override
    public Void postStudents(List<AlunoDTO> alunos) {
        // toDo -> Chamar repository
        alunos.forEach(aluno -> {
            AlunoEntity alunoEntity = new AlunoEntity(aluno);
            FakeBanco.setAluno(alunoEntity);

        });
        return null;
    }
}
