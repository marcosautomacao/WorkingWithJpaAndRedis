package br.com.fiap.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Participante;
import br.com.fiap.helper.EventoHelper;

public class main {
	public static void main(String[] args) {
		// incluirEvento();
		// listarEventos();
		listarParticipantes(1);
	}

	private static void listarParticipantes(int idEvento) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
		EntityManager em = emf.createEntityManager();
		EventoHelper helper = new EventoHelper(em);

		for (Participante participante : helper.listarParticipantes(idEvento)) {
			System.out.println("Id: " + participante.getId());
			System.out.println("Nome: " + participante.getNome());
			System.out.println("Email: " + participante.getEmail());
			System.out.println("-------------------------------------");
		}
	}
}
