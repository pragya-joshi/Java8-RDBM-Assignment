package assignment1;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapAssgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>productList1=Arrays.asList("HP","Dell","Lenovo");
		List<String>productList2=Arrays.asList("Redmi","Samsung","Nokia");
		List<String>productList3=Arrays.asList("Nikon","Kodak","Canon");
		
		List<List<String>>prodList=new ArrayList<>();
		
		
		prodList.add(productList1);
		prodList.add(productList2);
		prodList.add(productList3);
		
		
		List<String>prodNames=prodList.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		System.out.println(prodNames);
	}

}
