package com.weatherapp.main;

import com.weatherapp.displays.InfoDisplayerMultipleLine;
import com.weatherapp.displays.InfoDisplayerSingleLine;
import com.weatherapp.pushers.ScorePusher;
import com.weatherapp.pushers.WeatherPusher;

public class Tester {

	public static void main(String[] args) {

		WeatherPusher wp=new WeatherPusher();
		ScorePusher sp = new ScorePusher();
		InfoDisplayerSingleLine wc = new InfoDisplayerSingleLine(wp);
		InfoDisplayerSingleLine sc = new InfoDisplayerSingleLine(sp);
		InfoDisplayerMultipleLine mwc = new InfoDisplayerMultipleLine(wp);
		InfoDisplayerMultipleLine msc = new InfoDisplayerMultipleLine(sp);
		wp.changeTheWeather(5, 70);
		sp.scoreChanged(5, 2);

	}

}
