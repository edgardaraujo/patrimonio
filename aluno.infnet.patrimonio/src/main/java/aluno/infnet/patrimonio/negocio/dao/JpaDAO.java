package aluno.infnet.patrimonio.negocio.dao;

import java.util.List;

import javax.persistence.EntityManager;

import aluno.infnet.patrimonio.negocio.JpaConnection;

public class JpaDAO<T, ID> {

	protected Class<T> clazz;
	protected EntityManager em;

	public JpaDAO(Class<T> clazz) {
		this.clazz = clazz;
	}

	public T find(ID id) {
		this.em = JpaConnection.getEmf().createEntityManager();
		return this.em.find(clazz, id);
	}

	public List<T> findAll() {
		this.em = JpaConnection.getEmf().createEntityManager();
		List<T> entities = this.em.createQuery("from " + clazz.getName(), clazz)
				.getResultList();
		this.em.close();
		return entities;
	}

	public Boolean delete(ID id) {
		this.em = JpaConnection.getEmf().createEntityManager();
		this.em.getTransaction().begin();
		T entity = this.em.find(clazz, id);
		this.em.remove(entity);
		this.em.getTransaction().commit();
		this.em.close();
		return true;
	}

	public Boolean update(T entity) {
		this.em = JpaConnection.getEmf().createEntityManager();
		this.em.getTransaction().begin();
		this.em.merge(entity);
		this.em.getTransaction().commit();
		this.em.close();
		return true;
	}

	public Boolean save(T entity) {
		this.em = JpaConnection.getEmf().createEntityManager();
		this.em.getTransaction().begin();
		this.em.persist(entity);
		this.em.getTransaction().commit();
		this.em.close();
		return true;
	}

}
//
//public class JpaDAO<T, ID> {
//
//	protected EntityManager em;
//	protected Class<T> clazz;
//
//	public JpaDAO(Class<T> clazz) {
//		this.clazz = clazz;
//		this.em = JpaConnection.getEmf().createEntityManager();
//	}
//
//	public List<T> findAll() {
//		this.em = JpaConnection.getEmf().createEntityManager();
//		return this.em.createQuery("from " + clazz.getName() , clazz).getResultList();
//	}
//
//	public T find(ID id) {
//		this.em = JpaConnection.getEmf().createEntityManager();
//		return (T) this.em.find(clazz, id);
//	}
//
//	public Boolean delete(T entity) {
//		this.em = JpaConnection.getEmf().createEntityManager();
//		this.em.getTransaction().begin();
//		this.em.remove(entity);
//		this.em.getTransaction().commit();
//		this.em.close();
//		return true;
//	}
//
//	public Boolean update(T entity) {
//		this.em = JpaConnection.getEmf().createEntityManager();
//		this.em.getTransaction().begin();
//		this.em.merge(entity);
//		this.em.getTransaction().commit();
//		this.em.close();
//		return true;
//	}
//
//	public Boolean save(T entity) {
//		this.em = JpaConnection.getEmf().createEntityManager();
//		this.em.getTransaction().begin();
//		this.em.persist(entity);
//		this.em.getTransaction().commit();
//		this.em.close();
//		return true;
//	}
//}
