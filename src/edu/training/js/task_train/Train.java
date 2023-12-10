package edu.training.js.task_train;

import java.util.Objects;

public class Train {
	
	private String trainDestination;
    private int trainNumber;
    private String trainDepartureTime;

    public Train() {

    }

    public Train(String trainDestination, int trainNumber, String trainDepartureTime) {
    	
    	setTrainDestination(trainDestination);
    	setTrainNumber(trainNumber);
    	setTrainDepartureTime(trainDepartureTime);
        
    }

    public String getTrainDestination() {
		return trainDestination;
	}

	public void setTrainDestination(String trainDestination) {
		this.trainDestination = trainDestination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainDepartureTime() {
		return trainDepartureTime;
	}

	public void setTrainDepartureTime(String trainDepartureTime) {
		this.trainDepartureTime = trainDepartureTime;
	}

	@Override
	public String toString() {
		return "Train [trainDestination=" + trainDestination + ", trainNumber=" + trainNumber + ", trainDepartureTime="
				+ trainDepartureTime + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(trainDepartureTime, trainDestination, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(trainDepartureTime, other.trainDepartureTime)
				&& Objects.equals(trainDestination, other.trainDestination) && trainNumber == other.trainNumber;
	}
    
}
