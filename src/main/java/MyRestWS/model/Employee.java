package MyRestWS.model;

public class Employee {

	private String empId;
	private String empName;
	private Integer empAge;
	private double salary;
	private String department;

	public Employee() {
		super();
	}

	public Employee(String empId, String empName, Integer empAge, double salary, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.salary = salary;
		this.department = department;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
