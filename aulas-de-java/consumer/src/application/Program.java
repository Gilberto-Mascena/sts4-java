package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

import entities.Product;

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

		double factor = sc.nextDouble();

		/*
		 * Implementacao com interface. 
		 * list.forEach(new PriceUpdate());
		 */

		/*
		 * Implementacao com Reference method, metodo estatico.
		 * list.forEach(Product::staticPriceUpdate);
		 */

		/*
		 * Implementacao com Reference method, metodo nao estatico.
		 * list.forEach(Product::nonPriceUpdate);
		 */

		// Exprecao lambda declarada.
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);

		/*
		 * Exprecao lambda inline. 
		 * list.forEach(p -> p.setPrice(p.getPrice() * factor));
		 */

		list.forEach(cons);

		list.forEach(System.out::println);

		sc.close();
	}
}
