package com.weatherapp.pushers;

import java.util.Observable;

public class WeatherPusher extends Observable {

	float temp,humidity;
	public float getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}


	public WeatherPusher() {
	}
	
	public void changeTheWeather(float temp, float humidity) {
		this.temp = temp;
		this.humidity = humidity;
		setChanged();
		notifyObservers();
	}
}
