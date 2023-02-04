package assignment1;

import java.util.*;
import java.util.stream.Collectors;


public class FilterAssgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>srcList=Arrays.asList("hello","pragya","this","program","is","working");
		
		List<String>targetList=new ArrayList<>();
		
		targetList=srcList.stream().filter(n->n.length()>5 && n.length()<8).collect(Collectors.toList());
		System.out.println(targetList);
	
	}

}
