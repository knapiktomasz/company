package model;

import java.math.BigDecimal;

public class Employee {
	
	private int id;
	private String name;
	private String surname;
	private String sex;
	private int deptNo;
	private BigDecimal sallary;
	private int age;
	private String position;
	private int childrenQuantity;
	private String pesel;
	private boolean maritalStatus; //true= ¿onaty, false = kawaler
	
		
	
	public Employee() {
		
	}
	
		
	public Employee(String name, String surname, String sex, int deptNo, BigDecimal sallary, int age, String position,
			int childrenQuantity, String pesel, boolean maritalStatus) {
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.deptNo = deptNo;
		this.sallary = sallary;
		this.age = age;
		this.position = position;
		this.childrenQuantity = childrenQuantity;
		this.pesel = pesel;
		this.maritalStatus = maritalStatus;
	}


	public Employee(int id, String name, String surname, String sex, int deptNo, BigDecimal sallary, int age,
			String position, int childrenQuantity, String pesel, boolean maritalStatus) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.deptNo = deptNo;
		this.sallary = sallary;
		this.age = age;
		this.position = position;
		this.childrenQuantity = childrenQuantity;
		this.pesel = pesel;
		this.maritalStatus = maritalStatus;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public BigDecimal getSallary() {
		return sallary;
	}
	public void setSallary(BigDecimal sallary) {
		this.sallary = sallary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getChildrenQuantity() {
		return childrenQuantity;
	}
	public void setChildrenQuantity(int childrenQuantity) {
		this.childrenQuantity = childrenQuantity;
	}
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public boolean isMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	

}
