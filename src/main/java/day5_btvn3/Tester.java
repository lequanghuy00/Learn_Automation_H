package day5_btvn3;

public class Tester extends Employee
{
	private int numberofbuglog;
	@Override
	public void initInfo()
	{
		super.initInfo();
		System.out.print("nhap so bug da log: ");
		numberofbuglog = scanner.nextInt();
		System.out.println("So bug Tester " + getEmployee_name() + "da log: " + numberofbuglog);
	}
	
}
