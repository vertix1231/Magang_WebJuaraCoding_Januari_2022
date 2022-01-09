package com.juaracoding.magang.web.juaracoding.driver;

import com.juaracoding.magang.web.juaracoding.utils.ConstantsDriver;

public class DriverStrategyImplementor {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case ConstantsDriver.CHROME:
			return new Chrome();

		case ConstantsDriver.FIREFOX:
			return new FireFox();

		default:
			return null;
		}
	}
}
