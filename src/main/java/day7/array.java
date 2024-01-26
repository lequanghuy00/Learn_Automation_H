package day7;

import java.util.Scanner;

import day5_btvn3.Employee;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int numberOfEmployee = scanner.nextInt();
        Employee[] employees = new Employee[numberOfEmployee];
        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.print("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            String tennv = scanner.next();
	}

}
}
