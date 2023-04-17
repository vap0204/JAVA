
public class Teacher extends Person{

	int salary;
	
	public Teacher(String name, String sex, String egn, int salary) {
		super(name, sex, egn);
		this.salary=salary;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println(salary);
	}

	@Override
	public float getData() {
		
		return salary;
	}
	
	

}
