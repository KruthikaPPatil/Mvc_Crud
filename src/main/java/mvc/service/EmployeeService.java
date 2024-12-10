package mvc.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import mvc.dao.EmployeeDao;
import mvc.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	
	public String add(Employee employee, ModelMap map) {
		dao.save(employee);
		map.put("success","record added successfully");
		return "Home.jsp";
	}
	
	public String fetch(ModelMap map) {
		List<Employee> list = dao.fetchAll();
		if(list.isEmpty()) {
			map.put("failure", "no record found");
			return "Home.jsp";
		}
		else {
			map.put("list", list);
			return "fetch.jsp";
		}
	}

	public String delete(int id, ModelMap map) {
	
		Employee employee = dao.find(id);
		dao.delete(employee);
		map.put("success", "record deleted successfully");
		return "fetch";
	}

	public String edit(int id, ModelMap map) {
		// TODO Auto-generated method stub
		Employee employee = dao.find(id);
		map.put("emp", employee);
		return "edit.jsp";
	}
	
	

	public String update(Employee employee, ModelMap map) {
		// TODO Auto-generated method stub
		dao.update(employee);
		map.put("success","record updated successfully");
		return "fetch";
	}

	
	
}
