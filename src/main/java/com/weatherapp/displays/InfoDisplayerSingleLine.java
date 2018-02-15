package com.weatherapp.displays;

import java.util.Observable;
import java.util.Observer;

import com.weatherapp.pushers.ScorePusher;
import com.weatherapp.pushers.WeatherPusher;

public class InfoDisplayerSingleLine implements Observer {
	Observable ob;
	
	public InfoDisplayerSingleLine(Observable ob) {
		this.ob=ob;
		ob.addObserver(this);
		
	}
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherPusher)
		{
		 WeatherPusher wp = (WeatherPusher)o;
		 System.out.println("Weather is "+wp.getTemp()+" C and Humidity :"+wp.getHumidity()+"%");
		}
		else if(o instanceof ScorePusher)
		{
			ScorePusher sp = (ScorePusher)o;
			System.out.println("Score is "+sp.getRuns()+" Runs and Overs :"+sp.getOvers());
		}
	}
	
}
