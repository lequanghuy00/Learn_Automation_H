package day5_btvn3;
import java.util.Scanner;
public class Application {
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số nhân viên trong công ty: ");
	        int numberOfEmployee = scanner.nextInt();
	        Employee[] employees = new Employee[numberOfEmployee];
	        for (int i = 0; i < numberOfEmployee; i++) {
	            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
	            System.out.print("Select type 1 -TESTER, 2 -DEV, 3 -BA: ");
	            int choose = scanner.nextInt();

	            if (choose == 1) {
	                employees[i] = new Tester();
	            }
	            else if (choose == 2) {
	                employees[i] = new Developer();
	            }
	            else {
	                employees[i] = new BA();
	            }
	            employees[i].initInfo();
	        }
	 

	}

}
