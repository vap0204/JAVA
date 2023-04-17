
public class Student extends Person{
	float aver;
	public Student(String name, String sex, String egn, float aver) {
		super(name, sex, egn);
		this.aver=aver;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println(aver);
	}

	@Override
	public float getData() {
		
		return aver;
	}
	
}
