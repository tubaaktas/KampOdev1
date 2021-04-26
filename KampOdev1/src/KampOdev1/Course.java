package KampOdev1;

public class Course {
	public Course() {
		System.out.println("Kurs çaðýrýldý.");
	}
	public Course(int id,String name,String courseCategory) {
		this.id=id;
		this.name=name;
		this.courseCategory=courseCategory;
	}
	
	int id;
	String name;
	String courseCategory;
}
