package com.employeescenario;

public class Employee {
	
	Integer id;
	String name;
	Integer age;
	String gender;
	String department;
	Integer yearOfJoining;
	Double salary;

	public Employee(Integer _id, String _name, int _age,String _gender, String _department, Integer _yearOfJoining,
			Double salary) {
		super();
		this.id = _id;
		this.name = _name;
		this.age = _age;
		this.gender = _gender;
		this.department = _department;
		this.yearOfJoining = _yearOfJoining;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(Integer yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	
}
