package com.accenture.demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1,2,3,4,5);
		List<Integer> finalList = new LinkedList<>();

		for(Integer i : numList) {
			final Integer j = i;

			List<Integer> filteredCollection = numList.stream().filter(e ->!e.equals(j))
					.collect(Collectors.toList());
			Integer multiplied = multiply(filteredCollection);
			finalList.add(multiplied);
		}
		System.out.println(finalList);
	}
	private static Integer multiply(List<Integer> values) {

		return values.stream().reduce(1, (a,b) -> a*b);
	}
}
