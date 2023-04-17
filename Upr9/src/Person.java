
public abstract class Person {

	String name, sex, egn;

	public Person(String name, String sex, String egn) {
		
		this.name = name;
		this.sex = sex;
		this.egn = egn;
	}
	
	public void printInfo() {
		System.out.println(name+" "+sex+" "+egn);
	}
	
	public abstract float getData();
}
