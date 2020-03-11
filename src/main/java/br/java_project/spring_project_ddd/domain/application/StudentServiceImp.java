package br.java_project.spring_project_ddd.domain.application;

import br.java_project.spring_project_ddd.FakeBanco;
import br.java_project.spring_project_ddd.domain.interfaces.StudentService;
import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;
import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Override
    public List<AlunoDTO> find() {
        // toDo -> Chamar repository
        List<AlunoDTO> alunos = new ArrayList<AlunoDTO>();

        FakeBanco.getAlunos().forEach(a -> alunos.add(new AlunoDTO(a)));

        return alunos;
    }

    @Override
    public AlunoDTO findByOne(int id) {
        // toDo -> Chamar repository
        AlunoDTO aluno = new AlunoDTO();


        return aluno;
    }

    @Override
    public AlunoDTO postStudent(AlunoDTO aluno) {
        // toDo -> Chamar repository
        AlunoEntity alunos = new AlunoEntity(aluno);
        FakeBanco.setAluno(alunos);
        return aluno;
    }
}
