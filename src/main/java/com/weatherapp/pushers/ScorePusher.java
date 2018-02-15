package com.weatherapp.pushers;

import java.util.Observable;

public class ScorePusher extends Observable {
	int runs;
	float overs;
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public float getOvers() {
		return overs;
	}
	public void setOvers(float overs) {
		this.overs = overs;
	}
	public void scoreChanged(int runs,float overs)
	{
		this.runs=runs;
		this.overs=overs;
		setChanged();
		notifyObservers();
	}

}
