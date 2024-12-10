package mvc.dao;

import java.util.List;


import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import mvc.dto.Employee;

@Repository
public class EmployeeDao {

	EntityManagerFactory e = Persistence.createEntityManagerFactory("mcvCrud");
	EntityManager m = e.createEntityManager();
	EntityTransaction t = m.getTransaction();
	
	
	public void save(Employee employee) {
		t.begin();
		m.persist(employee);
		t.commit();
		
	}
	
	public List<Employee> fetchAll(){
		return m.createNativeQuery("select * from employee",Employee.class).getResultList();
	}

	public Employee find(int id) {
		// TODO Auto-generated method stub
		return m.find(Employee.class, id);
	}
	
	  public void delete(Employee employee) {
		  t.begin();
		  m.remove(employee);
		  t.commit();
	  }

	public void update(Employee employee) {
		t.begin();
		m.merge(employee);
		t.commit();
		
	}
	

}
