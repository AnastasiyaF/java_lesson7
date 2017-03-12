package com.epam.java_training.comparator;

import java.util.Comparator;
import com.epam.java_training.object.Composition;

public class Comparator_YearPublished implements Comparator<Composition>{
	
	@Override
	public int compare(Composition o1, Composition o2) {
		double year1 = o1.getYearPublished();
		double year2 = o2.getYearPublished();
		
		if (year1 < year2) {
			return -1;
		} else if (year1 == year2) {
			return 0;
		} else {
			return 1;
		}
	}
}
