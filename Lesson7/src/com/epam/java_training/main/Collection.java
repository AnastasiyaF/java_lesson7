package com.epam.java_training.main;

import com.epam.java_training.object.Composition;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

import com.epam.java_training.comparator.Comparator_Author;
import com.epam.java_training.comparator.Comparator_Title;
import com.epam.java_training.comparator.Comparator_YearPublished;

public class Collection {

	private Set<Composition> collection_list;
	private String type_collection;
	
	public Collection(String type_collection) {
		this.type_collection = type_collection;
		this.collection_list = new TreeSet<Composition>();
	}
	
	public String getType_collection() {
		return type_collection;
	}
	
	public Set<Composition> getCollection_list(){
		return this.collection_list;
	}
	
	public void addRecord(Composition composition){
		
		if (this.checkExistCompposition(composition) == true){
			
			System.out.println("The composition already exists with such fields and cannot be added.");
			System.out.println(composition);
			return;
			
		}
		
		this.collection_list.add(composition);
	}
	
	public void deleteRecord(Composition composition){
		this.collection_list.remove(composition);
	}

	
	public boolean checkExistCompposition(Composition current_composition){

		for (Composition elements : this.collection_list) {
			if (elements.equals(current_composition)){
				return true;
			}
		}
		
		return false;
	}
	
	public void printAllComposition(){
		
		
		for (Composition elements : this.collection_list) {
			System.out.println(elements);
		}
		
	}
	
	public static void printAllComposition(List<Composition> collection){
		
		
		for (Composition elements : collection) {
			System.out.println(elements);
		}
		
	}
	
	public List<Composition> sortByTitle(){
		Comparator<Composition> comparator = new Comparator_Title();
		List<Composition> collection_sort = new ArrayList<Composition>();
		
		collection_sort.addAll(this.getCollection_list());	
		
		collection_sort.sort(comparator);
		
		return collection_sort;
	}
	
	public List<Composition> sortByYear(){
		Comparator<Composition> comparator = new Comparator_YearPublished();
		
		List<Composition> collection_sort = new ArrayList<Composition>();
		
		collection_sort.addAll(this.getCollection_list());	
		
		collection_sort.sort(comparator);
		
		return collection_sort;
	}

	public List<Composition> sortByAuthor(){
		Comparator<Composition> comparator = new Comparator_Author();
		List<Composition> collection_sort = new ArrayList<Composition>();
		
		collection_sort.addAll(this.getCollection_list());	
		
		collection_sort.sort(comparator);
		
		return collection_sort;
	}
	
	
	
}
