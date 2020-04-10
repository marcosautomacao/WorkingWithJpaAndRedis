package br.java_project.spring_project_ddd.controller;

import br.java_project.spring_project_ddd.domain.interfaces.PagamentosService;
import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;
import br.java_project.spring_project_ddd.domain.models.dto.TransacaoDTO;
import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pagamentos")
public class PagamentosController {

    private final PagamentosService pagamentosService;

    public PagamentosController(PagamentosService pagamentosService) {
    	
        this.pagamentosService = pagamentosService;
    }

    @GetMapping
    public  List<TransacaoDTO> getPagamentos() {
    	
    	pagamentosService.find();
    	
        return pagamentosService.find();
    }
    
    @GetMapping("porCliente")
    public  List<TransacaoDTO> getPagamentosPorCliente() {
    	
    	pagamentosService.find();
    	
        return pagamentosService.find();
    }
    
    @PostMapping
    public  TransacaoDTO postPagamento(@RequestBody TransacaoDTO transacao) {
    	
    	return pagamentosService.postTransaction(transacao);
    }
}