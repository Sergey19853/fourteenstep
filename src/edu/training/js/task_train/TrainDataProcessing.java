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
        boolean flag = true;

        while (flag) {
        	flag = false;

            for (int i = 0, j = 1; i < trainList.size() - 1; i++, j++) {
                Train t1 = trainList.get(i);
                Train t2 = trainList.get(j);
                if (t1.getTrainDestination().compareTo(t2.getTrainDestination()) > 0) {
                    trainList.set(i, t2);
                    trainList.set(j, t1);
                	flag = true;
                }

                if (t1.getTrainDestination().equals(t2.getTrainDestination())) {
                    if (t1.getTrainDepartureTime().compareTo(t2.getTrainDepartureTime()) > 0) {
                    	trainList.set(i, t2);
                    	trainList.set(j, t1);
                    }
                }
            }
        }
    }

    public void printTrainInformation() {
    	
        for (Train train : trainList) {
            System.out.println(train.toString());
        }
        
    }

}
