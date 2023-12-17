package edu.training.js.task_train;

public class TrainDepartureTime {

    private int hour;
    private int minute;

    public TrainDepartureTime() {
    	
    }

	public TrainDepartureTime(int hour, int minute) {

		this.hour = hour;
		this.minute = minute;
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	@Override
	public String toString() {
		return "TrainDepartureTime [hour=" + hour + ", minute=" + minute + "]";
	}   
    
	
}
