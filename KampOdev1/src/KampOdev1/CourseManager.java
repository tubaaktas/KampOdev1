package KampOdev1;

public class CourseManager {
	public void addCourse(Course course) {
		System.out.println("Kurs eklendi " + course.name);
	}
	public void deleteCourse(Course course) {
		System.out.println("Kurs silindi. " + course.name);
	}

}
