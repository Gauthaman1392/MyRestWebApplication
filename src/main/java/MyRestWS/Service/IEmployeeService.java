package MyRestWS.Service;

import java.util.List;

import MyRestWS.model.Employee;


public interface IEmployeeService {
	
	public Employee getEmployee(String empId);
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(String empId);
	public List<Employee> getEmployees();

}
