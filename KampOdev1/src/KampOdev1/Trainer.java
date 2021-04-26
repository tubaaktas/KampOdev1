package KampOdev1;

public class Trainer {
	
	public Trainer() {
		System.out.println(" Trainer constructor çalýþtý. ");
	}
	public Trainer(int id,int courseId,String name) {
		this();
		this.id=id;
		this.name=name;
		this.courseId=courseId;
	}
	int id;
	int courseId;
	String name;
	
}
