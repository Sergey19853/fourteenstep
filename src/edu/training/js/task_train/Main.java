package edu.training.js.task_train;

public class Main {

	public static void main(String[] args) {

		TrainDataProcessing trainDataProcessing = new TrainDataProcessing();

		trainDataProcessing.addTrainInformation(new Train("Барановичи", 10, "1:00"));
		trainDataProcessing.addTrainInformation(new Train("Полоцк", 9, "2:00"));
		trainDataProcessing.addTrainInformation(new Train("Бобруйск", 5, "3:00"));
		trainDataProcessing.addTrainInformation(new Train("Несвиж", 12, "4:00"));
		trainDataProcessing.addTrainInformation(new Train("Каменец", 1, "5:00"));
		
		trainDataProcessing.sortByTrainNumber();
		trainDataProcessing.printTrainInformation();
		System.out.println();
		
		trainDataProcessing.sortByTrainDestination();
		trainDataProcessing.printTrainInformation();
		System.out.println();
		
		trainDataProcessing.trainNumberInformation(101);

	}

}
