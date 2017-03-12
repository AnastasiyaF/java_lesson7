/*
 * ������ 7.
 * Date: 12.03.2017
   Author: Anastasiya Findziukevich
   
������� ������������ ������������. ����������� ����������, ����������� ��������� �������� ������������ 
(������, �������������� ����� �������). ������������� �������� �������� ������������ ������������(�����, ����� � �.�.) 
� ����� ��������(������, ����� � �.�.). ���������� ����������� �����������, ���� �� ���������� ������������ � ��������.
���������� ������� ��� �����������, ��� ���������� ������ ������������, � �������� � ��� ����������� ����� ����������.
 * 
 * 
 */

package com.epam.java_training.main;

import com.epam.java_training.object.Composition;
import com.epam.java_training.object.FairyTale;
import com.epam.java_training.object.Poem;
import com.epam.java_training.object.Story;

import java.util.List;

public class Main {
	
	
	public static void main(String[] args){
		
		Collection collection_1 = new Collection("������");
		
	    Collection collection_2 = new Collection("�����");

	    List<Composition> collection_sort;
	    Composition composition_compare;
	    
	    Composition composition = new Story("�������_1", 1976, "�����_1", "���_1");
	    collection_1.addRecord(composition);
	    
	    composition = new Story("�������_2", 1983, "�����_2", "���_1");
	    collection_1.addRecord(composition);
		
	    composition = new FairyTale("������_3", 1926, "�����_3", "����������� ����������");
	    collection_1.addRecord(composition);
	    
	    composition = new FairyTale("������_4", 1965, "�����_4", "�������� ������� ������");
	    collection_1.addRecord(composition);
	    
	    
	    composition = new Story("�������_3", 1965, "�����_6", "���_2");
	    collection_2.addRecord(composition);
		
	    composition = new Poem("�����_3", 1926, "�����_8", "�������� �������������");
	    collection_2.addRecord(composition);
	    
	    composition = new Poem("�����_7", 1926, "�����_7", "�������� �������������");
	    collection_2.addRecord(composition);
	    
	    composition = new FairyTale("������_6", 1934, "�����_7", "������� ������");
	    collection_2.addRecord(composition);

		System.out.println("������� �1:");
		collection_1.printAllComposition();
		
		System.out.println();
		System.out.println("������� �2:");
		collection_2.printAllComposition();

		
		System.out.println();
		System.out.println("�������� �������� ������������ ��� �������� �� �������������: ");
		
		composition_compare = new FairyTale("������_6", 1934, "�����_7", "������� ������");
		System.out.println(composition_compare);
		
		System.out.print("�������� ���� �� ������ � 1 ��������: ");
		if (collection_1.checkExistCompposition(composition_compare) == true){
		    	System.out.println("������������ ���������� � ��������.");
		    }
		    else{
		    	System.out.println("�� ������� �� �������� ���������.");
		 };
		
	    System.out.print("�������� ���� �� ������ �� 2 ��������: ");
	    if (collection_2.checkExistCompposition(composition_compare) == true){
	    	System.out.println("������������ ���������� � ��������.");
	    }
	    else{
	    	System.out.println("�� ������� �� �������� ���������.");
	    };
	    
	    
	    System.out.println();
		System.out.println("�������� 2 �������� ������������ ��� �������� �� �������������: ");
		
		composition_compare = new Story("�������_2", 1983, "�����_2", "���_1");
		System.out.println(composition_compare);
		
		System.out.print("�������� ���� �� ������ � 1 ��������: ");
	    if (collection_1.checkExistCompposition(composition_compare) == true){
	    	System.out.println("������������ ���������� � ��������.");
	    }
	    else{
	    	System.out.println("�� ������� �� �������� ���������.");
	    };
		
	    System.out.print("�������� ���� �� ������ �� 2 ��������: ");
	    if (collection_2.checkExistCompposition(composition_compare) == true){
	    	System.out.println("������������ ���������� � ��������.");
	    }
	    else{
	    	System.out.println("�� ������� �� �������� ���������.");
	    };
	    
	    
	    System.out.println();
		System.out.println("�������� 3 �������� ������������ ��� �������� �� �������������: ");
		
		composition_compare =  new Poem("�����_3", 1926, "�����_8", "�������� �������������_1");
		System.out.println(composition_compare);
		
		System.out.print("�������� ���� �� ������ � 1 ��������: ");
		if (collection_1.checkExistCompposition(composition_compare) == true){
	    	System.out.println("������������ ���������� � ��������.");
	    }
	    else{
	    	System.out.println("�� ������� �� �������� ���������.");
	    };
		
	    System.out.print("�������� ���� �� ������ �� 2 ��������: ");
	    if (collection_2.checkExistCompposition(composition_compare) == true){
	    	System.out.println("������������ ���������� � ��������.");
	    }
	    else{
	    	System.out.println("�� ������� �� �������� ���������.");
	    }; 
	        
	    System.out.println();
	    System.out.println("���������� 1 �������� �� �������� �����:  ");
	    collection_sort = collection_1.sortByTitle();
	    Collection.printAllComposition(collection_sort);
	    
	    System.out.println();
	    System.out.println("���������� 1 �������� �� ���� ������������:  ");
	    collection_sort = collection_1.sortByYear();
	    Collection.printAllComposition(collection_sort);
	    
	    System.out.println();
	    System.out.println("���������� 1 �������� �� ����� ������:  ");
	    collection_sort = collection_1.sortByAuthor();
	    Collection.printAllComposition(collection_sort);
	    
	    System.out.println();
	    System.out.println("���������� 2 �������� �� �������� �����:  ");
	    collection_sort = collection_2.sortByTitle();
	    Collection.printAllComposition(collection_sort);
	    
	    System.out.println();
	    System.out.println("���������� 2 �������� �� ���� ������������:  ");
	    collection_sort = collection_2.sortByYear();
	    Collection.printAllComposition(collection_sort);
	    
	    System.out.println();
	    System.out.println("���������� 2 �������� �� ����� ������:  ");
	    collection_sort = collection_2.sortByAuthor();
	    Collection.printAllComposition(collection_sort);
	    
	}
	
	

}
