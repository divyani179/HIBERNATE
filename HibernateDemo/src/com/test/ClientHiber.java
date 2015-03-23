package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.bean.Employee;
import com.dao.EmpDAO;
import com.dao.Empimpl;

public class ClientHiber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmpDAO ref=new  Empimpl();
Scanner sc=new Scanner(System.in);
/*for(int i=0;i<5;i++){
	String name=sc.next();
	int salary =sc.nextInt();
	String city=sc.next();
	Employee e=new Employee();
	e.setName(name);
	e.setSalary(salary);
	e.setCity(city);
	Long id=ref.addEmployee(e);
	System.out.println("employee added");
	System.out.println("id is"+id);
}
*/
/*ref.deleteEmp(1);
System.out.println("employee deleted!");

ref.updateEmployee(4, 20);*/

/*ArrayList<Employee> list=(ArrayList<Employee>) ref.getAllEmployees();
Iterator<Employee> i=list.iterator();
while(i.hasNext()){

	Employee employee=i.next();
	System.out.println(employee);

}*/
///////////////////////////////////////////////////////////////

ArrayList<Employee> list=(ArrayList<Employee>) ref.getEmployeeBySalary(20);
Iterator<Employee> i=list.iterator();
while(i.hasNext()){

	Employee employee=i.next();
	System.out.println(employee);

}



	}

}
