package com.epam.java_training.comparator;

import java.util.Comparator;

import com.epam.java_training.object.Composition;

public class Comparator_Author implements Comparator<Composition>{
	
	@Override
	public int compare(Composition o1, Composition o2) {
		
		String string_1 = o1.getAuthor();
		String string_2 = o2.getAuthor();
		
		return string_1.compareTo(string_2);
	}
}
