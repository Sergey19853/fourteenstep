package edu.training.js.task_train;

public class Main {

	public static void main(String[] args) {

		TrainDataProcessing trainDataProcessing = new TrainDataProcessing();

		trainDataProcessing.addTrainInformation("Барановичи", 10, 1, 0);
		trainDataProcessing.addTrainInformation("Полоцк", 9, 2, 0);
		trainDataProcessing.addTrainInformation("Бобруйск", 5, 3, 0);
		trainDataProcessing.addTrainInformation("Несвиж", 12, 4, 0);
		trainDataProcessing.addTrainInformation("Каменец", 1, 5, 0);
		
		trainDataProcessing.sortByTrainNumber();
		
		for (Train train : trainDataProcessing.getTrainInformation()) {
			
			System.out.println(train.toString());
		}
		
		System.out.println();
		
		trainDataProcessing.sortByTrainDestination();
		
		for (Train train : trainDataProcessing.getTrainInformation()) {
			
			System.out.println(train.toString());
		}
		System.out.println();
		
		trainDataProcessing.trainNumberInformation(101);

	}

}
