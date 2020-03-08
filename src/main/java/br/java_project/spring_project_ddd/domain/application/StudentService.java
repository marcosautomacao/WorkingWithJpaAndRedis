package br.java_project.spring_project_ddd.domain.application;

import br.java_project.spring_project_ddd.domain.interfaces.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Override
    public String find() {
        return null;
    }

    @Override
    public String findByOne(int id) {
        return null;
    }
}
