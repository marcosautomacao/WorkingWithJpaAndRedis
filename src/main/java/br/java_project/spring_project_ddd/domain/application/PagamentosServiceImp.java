package br.java_project.spring_project_ddd.domain.application;

import br.java_project.spring_project_ddd.FakeBanco;
import br.java_project.spring_project_ddd.domain.interfaces.PagamentosService;
import br.java_project.spring_project_ddd.domain.interfaces.StudentService;
import br.java_project.spring_project_ddd.domain.models.dto.AlunoDTO;
import br.java_project.spring_project_ddd.domain.models.dto.TransacaoDTO;
import br.java_project.spring_project_ddd.domain.models.entities.AlunoEntity;
import br.java_project.spring_project_ddd.domain.models.entities.PagamentoEntity;
import br.java_project.spring_project_ddd.infrastructure.PagamentoRepositoryBase;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentosServiceImp implements PagamentosService {

	@Autowired
    PagamentoRepositoryBase pagamentosRepository;
	

	@Override
	public List<TransacaoDTO> find() {
        List<TransacaoDTO> transacoes = new ArrayList<TransacaoDTO>();
        
        pagamentosRepository.findAll().forEach(a -> transacoes.add(new TransacaoDTO(a)));
        
        return transacoes;
	}


	@Override
	public TransacaoDTO findByOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
    @Override
    public TransacaoDTO postTransaction(TransacaoDTO transacao) {
    	
    	PagamentoEntity pagamento = new PagamentoEntity(transacao);
        
        try {
        	pagamentosRepository.save(pagamento);
        } catch (Exception ex) {
        	System.out.println(ex.getMessage());
        }
        
        return transacao;
    }


	@Override
	public Void postTransactions(List<TransacaoDTO> transacao) {
		// TODO Auto-generated method stub
		return null;
	}
}
