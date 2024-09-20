package com.accenture.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MulList {
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5);
		List<Integer> finalList = new LinkedList<>();
		
		for(Integer i : numList) {
			final Integer j = i;
			
		List<Integer> filteredList = 	numList.stream().filter(e -> !e.equals(j))
			        .collect(Collectors.toList());
		          Integer mulnumbers =    multifly(filteredList);
		            finalList.add(mulnumbers);
		}
		System.out.println(finalList);
	}

	private static Integer multifly(List<Integer> filteredList) {
		
		return filteredList.stream().reduce(1, (a,b) -> a*b);
	}
}
