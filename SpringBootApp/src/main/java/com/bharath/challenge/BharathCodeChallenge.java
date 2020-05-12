package com.bharath.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.bharath.model.Person;

public class BharathCodeChallenge {
	//USING jAVA 8 FEATURES ONLy
	// Create a Person Class with Attributes as AGE,GENDER,SALARY,LOCATION
	// 1. Find out SUM of the salaries of individuals who are FEMALES , AGE > 28 , SLARY > 20000 , belong to HYDERABAD
	// 2. accumulate  PERSONS belonging to Different LOCATIONS
	public static void main(String a[]) {
	Person cityHyderabad=new Person(30,"FeMale",30000.0,"Hyderabad");
	Person cityChennai=new Person(28,"FeMale",5000.0,"Chennai");
	Person cityHyderabadFemale=new Person(29,"FeMale",30000.0,"Hyderabad");
	Person cityBangalore=new Person(30,"FeMale",30000.0,"Bangalore");
	Person cityPuneFemale=new Person(29,"FeMale",20000.0,"Pune");
	Person cityBangaloreMale=new Person(30,"Male",30000.0,"Bangalore");
	
	List<Person> listOfPersons=new ArrayList<>();
	listOfPersons.add(cityHyderabad);
	listOfPersons.add(cityChennai);
	listOfPersons.add(cityHyderabadFemale);
	listOfPersons.add(cityBangalore);
	listOfPersons.add(cityPuneFemale);
	listOfPersons.add(cityBangaloreMale);
	// 1. Find out SUM of the salaries of individuals who are FEMALES , AGE > 28 , SLARY > 20000 , belong to HYDERABAD
	
	List<Person> filteredPersonas=listOfPersons.stream().filter(p-> p.getGender().equals("FeMale") 
			&& p.getAge() > 28 && p.getSalary()> 20000.0 && p.getLocation().equals("Hyderabad")).collect(Collectors.toList());
	
	ListIterator<Person> iterator=filteredPersonas.listIterator();
	Double sumOfsalaray=0.0;
	while(iterator.hasNext()) {
		Person p=iterator.next();
		sumOfsalaray=sumOfsalaray+p.getSalary();		
	}
	System.out.println("Sum of salary "+sumOfsalaray);
	
	
	// 2. accumulate  PERSONS belonging to Different LOCATIONS	
	 Map<String, Long> counting = listOfPersons.stream().collect(
             Collectors.groupingBy(Person::getLocation, Collectors.counting()));
	
	 System.out.println("Persons By City" +counting);
	}
}
