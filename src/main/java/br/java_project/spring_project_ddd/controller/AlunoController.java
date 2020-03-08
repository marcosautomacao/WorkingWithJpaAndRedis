package br.java_project.spring_project_ddd.controller;

import br.java_project.spring_project_ddd.domain.interfaces.IStudentService;
import br.java_project.spring_project_ddd.domain.models.AlunoEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    private final IStudentService studentService;
    private AlunoEntity aluno;

    public AlunoController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String get() {
        return studentService.find();
    }

    @GetMapping("{id}")
    public String getById(@PathVariable int id) {
        return studentService.findByOne(id);
    }

    @PostMapping
    public String postStudent() {
        return studentService.find();
    }

}