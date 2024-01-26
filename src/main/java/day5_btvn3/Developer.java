package day5_btvn3;

public class Developer extends Employee
{
	private int numberofbugfix;
	@Override
	public void initInfo()
	{
		super.initInfo();
		System.out.print("nhap so bug da fix: ");
		numberofbugfix = scanner.nextInt();
		System.out.println("So bug dev " + getEmployee_name() + "da fix duox la: " + numberofbugfix);
	}
	
}
