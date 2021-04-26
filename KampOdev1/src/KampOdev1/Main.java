package KampOdev1;


public class Main {

	public static void main(String[] args) {
		
		Trainer trainer1 = new Trainer(1,1, "Engin Demiroğ");

		Trainer trainer2 = new Trainer();
		trainer2.id = 2;
		trainer2.courseId=2;
		trainer2.name = "Tuğba Aktaş";


		Trainer[] trainers = { trainer1, trainer2 };

		for (Trainer trainer : trainers) {
			System.out.println(trainer.name);
		}
		
		Course course1=new Course();
		course1.id=1;
		course1.name="Yazılım Geliştirme Kampı 1 ";
		course1.courseCategory="C# + ANGULAR";
		
		Course course2=new Course();
		course2.id=2;
		course2.name="Yazılım Geliştirme Kampı 2";
		course2.courseCategory="JAVA + REACT";
		
		
		
		TrainerManager trainerManager=new TrainerManager();
		trainerManager.addToTrainer(trainer1);
		
		trainerManager.deleteToTrainer(trainer2);
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course1);
		courseManager.deleteCourse(course2);

	}

}
