package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AlunoService
 *
 */
public class AlunoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EntityManager em;

	public AlunoService() {
		super();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		
		em = emf.createEntityManager();
	}
	
	public void cadastrar(Aluno a){
		em.getTransaction().begin();
		
		em.persist(a);
		
		em.getTransaction().commit();
	}
	
	public Aluno obterPorId(int id){
		return em.find(Aluno.class, id);
	}
	
	public void excluir(Aluno a){
		em.getTransaction().begin();
		
		em.remove(a);
		
		em.getTransaction().commit();
	}
	
	public void editar(Aluno a){
		em.getTransaction().begin();
		
		em.merge(a);
		
		em.getTransaction().commit();
	}
	
	public List<Aluno> listarTodos(){
		Query q = em.createQuery("Selec a FROM Aluno a");
		
		return q.getResultList();
	}
	
	/*
	 * main(){
	 * 	AlunoService as = new AlunoService();
	 * 	Aluno a1 = new Aluno(. . .);
	 * 	as.cadastrar(a1);
	 * */
   
}
