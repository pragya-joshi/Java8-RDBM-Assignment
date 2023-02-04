package assignment3;

import java.util.*;

interface MethodRefPerson{
	Person getPerson(String name,int age);
}


public class TesterPerson  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRefPerson obj=Person::new;
		
		List<Person>pList=new ArrayList<>();
		pList.add(obj.getPerson("Amisha", 23));
		pList.add(obj.getPerson("Isha",26));
		pList.add(obj.getPerson("Harsh",21));
		pList.add(obj.getPerson("Harshita",32));	
		
		for(Person person:pList) {
			System.out.println(person);
		}
	}

}
