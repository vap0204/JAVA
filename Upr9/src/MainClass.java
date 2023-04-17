import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
	
		Student s1=new Student("Elena","woman","1111",5);
		Student s2=new Student("Mariq","woman","2222",4);
		Student s3=new Student("Elena","man","3333",6);
		
		Teacher t1=new Teacher("Georgi", "man", "4444", 1000);
		Teacher t2=new Teacher("Elena", "woman", "5555", 2000);
		Teacher t3=new Teacher("Ivan", "man", "6666", 1500);
		
		ArrayList<Person> arr=new ArrayList<Person>();
		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(t1);
		arr.add(t2);
		arr.add(t3);
		
		float maxAver=Float.MIN_VALUE;
		int st=0;
		
		int sum=0;
		int brTeacher=0;
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i) instanceof Student) {
				if(arr.get(i).sex.equals("woman")) {
					if(arr.get(i).getData()>maxAver) {
						maxAver=arr.get(i).getData();
						st=i;
					}
					else;
				}
				else;
			}
			else {
				sum+=arr.get(i).getData();
				brTeacher++;
			}
		}
		
		arr.get(st).printInfo();
		
		System.out.println("Average salaty:"+sum/brTeacher);
		

	}

}
