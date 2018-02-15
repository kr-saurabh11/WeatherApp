package com.weatherapp.displays;

import java.util.Observable;
import java.util.Observer;

import com.weatherapp.pushers.ScorePusher;
import com.weatherapp.pushers.WeatherPusher;

public class InfoDisplayerMultipleLine implements Observer {
	Observable ob;
	public InfoDisplayerMultipleLine(Observable ob)
	{
		this.ob = ob;
		ob.addObserver(this);
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherPusher)
		{
		 WeatherPusher wp = (WeatherPusher)o;
		 System.out.println("Weather is: \n"+wp.getTemp()+" C \nHumidity :"+wp.getHumidity()+"%");
		}
		else if(o instanceof ScorePusher)
		{
			ScorePusher sp = (ScorePusher)o;
			System.out.println("Score is \n"+sp.getRuns()+" Runs \nOvers :"+sp.getOvers());
		}
		
	}

}
