package assignment1;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String name;
	double salary;
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
}

public class MapAssgn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>empList=new ArrayList<>();
		
		empList.add(new Employee(101,"James",45000));
		empList.add(new Employee(102,"John",50000));
		empList.add(new Employee(103,"David",30000));
		
		List<Double>updatedSalaryList=new ArrayList<>();
		updatedSalaryList=empList.stream().map(emp->emp.salary+(emp.salary*10)/100).collect(Collectors.toList());
		System.out.println(updatedSalaryList);	
	}
}
