package com;

import com.utility.PropertiesOperation;

public class TestProperties {

	public static void main(String[] args) {
		
		
		PropertiesOperation prop = new PropertiesOperation();
		String url = prop.getPropertyValue("hostURL");
	}

}
