package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Printing a list
		List<String> programmingLanguages = Arrays.asList("Java", "C++", "ASP.NET", ".Net", "PHP", "JavaEE");
		programmingLanguages.forEach(language -> System.out.println(language));

		// Printing a list in alphabetical order
		System.out.println("***************");
		programmingLanguages.sort(Comparator.naturalOrder());
		programmingLanguages.forEach(System.out::println);

		System.out.println("***************");
		// Printing all languages that contain the word Java
		programmingLanguages.stream()
				.filter(language -> language.contains("Java"))
				.forEach(System.out::println);

		System.out.println("***************");
		// Printing the first word that contains the word .Net
		programmingLanguages.stream()
				.filter(language -> language.contains(".NET"))
				.findFirst()
				.ifPresent(System.out::println);

		System.out.println("***************");
		// Printing the net salary after taxes
		List<Double> salaries = Arrays.asList(100d, 200d, 300d);
		salaries.stream().map((gross) -> gross - 0.25 * gross).forEach(System.out::println);

		System.out.println("***************");
		// Sum of taxes
		double sumTaxes = salaries.stream().map(gross -> .10 * gross).reduce((sum, gross) -> sum + gross).get();
		System.out.println("Total taxes : " + sumTaxes);

		System.out.println("***************");
		// Sum of odd integers
		List<Integer> integers = Arrays.asList(4, 5, 1, 8, 0, 3);
		integers.stream()
				.filter(i -> i % 2 == 1)
				.reduce((sum, i) -> sum + i)
				.ifPresent(System.out::println);

		System.out.println("***************");
		// print specific class objects
		List objects = Arrays.asList("a string", 1, 2L, "another string", 'c', 2.5f);
		objects.stream()
				.filter(obj -> obj instanceof String)
				.forEach(System.out::println);
	}
}
