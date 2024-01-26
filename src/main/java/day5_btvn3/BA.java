package day5_btvn3;

public class BA extends Employee
{
	private int numberofticketconfirm;
	@Override
	public void initInfo()
	{
		super.initInfo();
		System.out.print("nhap so ticket da confirm vs khach: ");
		numberofticketconfirm = scanner.nextInt();
		System.out.println("So ticket BA " + getEmployee_name() + "da confirm: " + numberofticketconfirm);
	}
	
}