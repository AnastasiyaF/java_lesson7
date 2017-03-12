package com.epam.java_training.comparator;

import java.util.Comparator;

import com.epam.java_training.object.Composition;

public class Comparator_Title implements Comparator<Composition>{
	
	@Override
	public int compare(Composition o1, Composition o2) {
		
		String string_1 = o1.getTitle();
		String string_2 = o2.getTitle();
		
		return string_1.compareTo(string_2);
	}
}
