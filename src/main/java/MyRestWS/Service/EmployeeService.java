package MyRestWS.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.log4j.Logger;

import MyRestWS.model.Employee;

public class EmployeeService implements IEmployeeService {

	final static Logger logger = Logger.getLogger(EmployeeService.class);

	private final AtomicLong empIdGen = new AtomicLong();
	List<Employee> employees = new ArrayList<Employee>();

	public EmployeeService() {
		Employee employee = new Employee();
		employee.setEmpId("1001");
		employee.setEmpName("Gautham");
		employee.setEmpAge(24);
		employee.setSalary(6000.00);
		employee.setDepartment("Economics");
		employees.add(employee);


		Employee employee1 = new Employee();
		employee1.setEmpId("1002");
		employee1.setEmpName("Dinesh");
		employee1.setEmpAge(27);
		employee1.setSalary(8000.00);
		employee1.setDepartment("Accounts");
		employees.add(employee1);
	}

	@Override
	public Employee getEmployee(String empId) {
		logger.debug("Executing getAccount method");

		for (Employee employee : employees) {
			if (employee.getEmpId().equals(empId)) {
				return employee;
			}
		}
		return null;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		logger.debug("Executing saveAccount method");
		employee.setEmpId(""+empIdGen.incrementAndGet());
		employees.add(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee source) {
		Employee employee = getEmployee(source.getEmpId());
		employee.setEmpName(source.getEmpName());
		employee.setEmpAge(source.getEmpAge());
		employee.setSalary(source.getSalary());
		employee.setDepartment(source.getDepartment());
		
		return employee;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public String deleteEmployee(String empId) {
logger.debug("Executing deleteAccount method");
		
		for (Employee employee : employees) {
			if (employee.getEmpId().equals(empId)) {
				employees.remove(employee);
				return empId;
			}
		}
		return null;
	}

}
