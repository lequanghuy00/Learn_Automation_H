package day5_btvn3;

import java.util.Scanner;

public abstract class Employee {

		private String employee_id;
		private String employee_name;
		
Scanner scanner = new Scanner(System.in); //input information of employee form keyboaard
	public void initInfo() 
		{
		  System.out.print("Nhập mã nhân viên: ");
		  employee_id = scanner.nextLine();
		  System.out.print("Nhập họ tên nhân viên: ");
		  employee_name = scanner.nextLine();
		}

	public String getEmployee_id() 
	{
	return employee_id;
	}

	public void setEmployee_id(String employee_id) 
	{
	this.employee_id = employee_id;
	}

	public String getEmployee_name() 
	{
	return employee_name;
	}

	public void setEmployee_name(String employee_name) 
	{
	this.employee_name = employee_name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
