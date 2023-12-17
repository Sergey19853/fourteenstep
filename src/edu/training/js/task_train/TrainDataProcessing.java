package edu.training.js.task_train;

import java.util.ArrayList;
import java.util.List;

public class TrainDataProcessing {
	
    private List<Train> trainList = new ArrayList<>();

    public TrainDataProcessing() {
    	
    }

    public boolean addTrainInformation(Train train) {
        
		  if (trainList.size() > 4) {
			  return false;
		  }
		  trainList.add(train);
		  return true;
		  
    }
    
    public void addTrainInformation(String trainDestination, int trainNumber, int hour, int minute) {
    	
    	trainList.add(new Train(trainDestination, trainNumber, hour, minute));
        
    }
    
    public List<Train> getTrainInformation() {
    	
        return trainList;
        
    }

    public void sortByTrainNumber() {
    	
        boolean flag = true;

        while (flag) {
        	flag = false;

            for (int i = 0; i < trainList.size() - 1; i++) {
                if (trainList.get(i).getTrainNumber() > trainList.get(i + 1).getTrainNumber()) {
                    Train trainNew = trainList.get(i);
                    trainList.set(i, trainList.get(i + 1));
                    trainList.set(i + 1, trainNew);
                    flag = true;
                }
            }
        }
    }
    
    public void trainNumberInformation(int trainNumber) {
    	
    	boolean information = false;
    	
        for (Train train : trainList) {
        	if (train.getTrainNumber() == trainNumber){
        		System.out.println(train.toString());       
        		information = true;
        	}
        }
        if (information == false) {
        	System.out.println("No information available");
        }
		
    }

    public void sortByTrainDestination(){

        for (int i = 0; i < trainList.size() - 1; i++) {
            for (int j = 0; j < trainList.size() - i - 1; j++) {

                if (trainList.get(j + 1).getTrainDestination().compareTo(trainList.get(j).getTrainDestination()) < 0) {
                    Train swap = trainList.get(j);
                    trainList.set(j, trainList.get(j + 1));
                    trainList.set(j + 1, swap);
                }

                if (trainList.get(j + 1).getTrainDestination().equals(trainList.get(j).getTrainDestination())) {
                    if (trainList.get(j + 1).getTrainDepartureTime().getHour() < trainList.get(j).getTrainDepartureTime().getHour()) {
                        Train swap = trainList.get(j);
                        trainList.set(j, trainList.get(j + 1));
                        trainList.set(j + 1, swap);
                    }
                }

            }
        }
        
    }

}
