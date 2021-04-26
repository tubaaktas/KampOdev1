package KampOdev1;

public class TrainerManager {
	public void addToTrainer(Trainer trainer) {
		System.out.println("Eðitmen ekleme çaðýrýldý. " + trainer.name);
	}
	public void deleteToTrainer(Trainer trainer) {
		System.out.println("Eðitmen silme çaðýrýldý. " + trainer.name);
	}
	public void updateToTrainer(Trainer trainer) {
		System.out.println("Eðitmen güncelleme çaðýrýldý. " + trainer.name);
	}
}
