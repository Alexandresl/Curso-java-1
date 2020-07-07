package S9.Aula77_encapsulamento.application;

import java.util.Locale;
import java.util.Scanner;

import S9.Aula77_encapsulamento.entities.Product;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product prod = new Product(name, price);
		
		prod.setName("Computer");
		System.out.println("Updated name: " + prod.getName());
		prod.setPrice(1200);
		System.out.println("Updated price: " + String.format("%.2f", prod.getPrice()));
		
		System.out.print("\nProducty data: " + prod);
		
		System.out.print("\n\nEnter the number of products to be added in stock: ");
		prod.addProducts(sc.nextInt());
		
		System.out.print("\nProducty data: " + prod);
		
		System.out.print("\n\nEnter the number of products to be removed from stock: ");
		prod.removeProducts(sc.nextInt());
		
		System.out.print("\nProducty data: " + prod);
		
		sc.close();

	}

}
