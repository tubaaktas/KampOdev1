package KampOdev1;

public class TrainerManager {
	public void addToTrainer(Trainer trainer) {
		System.out.println("E�itmen ekleme �a��r�ld�. " + trainer.name);
	}
	public void deleteToTrainer(Trainer trainer) {
		System.out.println("E�itmen silme �a��r�ld�. " + trainer.name);
	}
	public void updateToTrainer(Trainer trainer) {
		System.out.println("E�itmen g�ncelleme �a��r�ld�. " + trainer.name);
	}
}
