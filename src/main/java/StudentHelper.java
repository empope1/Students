import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * @author emilylester empope1
 * CIS 175 Spring 2024
 * Feb 22, 2024
 */
public class StudentHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("StudentRoster");

	public void insertNewStudent(Student s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Student> showAllItems(){
		EntityManager em = emfactory.createEntityManager();
		List<Student> allStudents = em.createQuery("SELECT s from Student s").getResultList();
		return allStudents;
		
	}
	

	public Student searchForStudentsById(Integer tempId) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		Student found = em.find(Student.class, tempId);
		em.close();
		return found;
	}

	public void deleteStudent(Student studentToDelete) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Student> typedQuery = em.createQuery("SELECT detail from Students detail where detail.id= :selectedId", Student.class);
		typedQuery.setParameter("selectedId", studentToDelete.getId());
		
		typedQuery.setMaxResults(1);
		
		Student result = typedQuery.getSingleResult();
		
		em.remove(result);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public void updateStudent(Student toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(em);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Student> searchForItemByGpa(int studentMajor) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Student> typedQuery = em.createQuery("select li from Student li where li.gpa = :selectedMajor", Student.class);
		
		typedQuery.setParameter("selectedMajor", studentMajor);
		
		List<Student> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}

	public List<Student> searchForItemByAgeString (int studentName) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Student> typedQuery = em.createQuery("select li from Student li where li.item = :selectedName", Student.class);
		
		typedQuery.setParameter("selectedName", studentName);
		
		List<Student> foundItems = typedQuery.getResultList();
		em.close();
		return foundItems;
	}
	
	public void cleanUp() {
		emfactory.close();
	}
}
