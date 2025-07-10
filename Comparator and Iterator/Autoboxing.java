package com.aaslin;

import java.util.Objects;

public class Autoboxing {
	public static void main(String[] args) {
		Integer intValue = Integer.valueOf(2); // Boxing
		Integer value = 4; //AutoBoxing
		
		value = null;
		
		// Opposite
		 
		int invValuePart = intValue; // AutoUnboxing
		
		
		if(invValuePart == 2) {
			
		} else if(value == 2) {
			
		} else {}
		
		
		if(Objects.equals(intValue, 2)) {
			
			
		}
		
		
		
	}
}
