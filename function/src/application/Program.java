package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

/*
 * Programacao funcional: consumer.
 */

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

		/*
		 * Implementacao com interface.
		 * A funcao map() so funciona pra list.		  
		 */
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());	

		names.forEach(System.out::println);

		sc.close();
	}
}
