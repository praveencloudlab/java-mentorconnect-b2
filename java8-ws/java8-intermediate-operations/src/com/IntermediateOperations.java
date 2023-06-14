package com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class IntermediateOperations {

	public static void main(String[] args) {
		
		/*
		 * intermediate operations
		 * ---------------------------
		 * filter 
		 * map
		 * flatMap
		 * distinct
		 * sorted
		 * peek
		 * 
		 * -------------------------
		 * final operations
		 * -------------------------
		 * 
		 * forEach
		 * 
		 */
		
		
		/*
		List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve", "Tom", "Bob", "Alice");
		
		names.stream()
			.filter(name->name.length()>3) //
			.map(String::toUpperCase) // 
			.sorted() //
			.forEach(System.out::println);
			
		*/
		
		
		List<Fruit> fruits = Arrays.asList(
			    new Fruit(1, "Mango1", "Yellow", "Mango", 5, 1.5, Arrays.asList("Alphonso", "Kesar")),
			    new Fruit(2, "Mango2", "Red", "Mango", 5, 2.0, Arrays.asList("Dasheri", "Badami")),
			    new Fruit(3, "Mango3", "Green", "Mango", 3, 1.7, Arrays.asList("Rajapuri", "Langra")),
			    new Fruit(4, "Apple1", "Green", "Apple", 3, 0.8, Arrays.asList("Granny Smith", "Honeycrisp")),
			    new Fruit(5, "Apple2", "Red", "Apple", 5, 0.9, Arrays.asList("Red Delicious", "Gala")),
			    new Fruit(6, "Apple3", "White", "Apple", 4, 1.2, Arrays.asList("Golden Delicious", "Ambrosia")),
			    new Fruit(7, "Banana1", "Yellow", "Banana", 3, 0.5, Arrays.asList("Cavendish", "Lady Finger")),
			    new Fruit(8, "Banana2", "Green", "Banana", 3, 0.4, Arrays.asList("Blue Java", "Manzano")),
			    new Fruit(9, "Banana3", "Red", "Banana", 4, 0.6, Arrays.asList("Red Banana", "Gros Michel"))
			);
		
		
		// Now, if we want to get all varieties of fruits in a single list, we can use flatMap:

		List<String> allVarieties = fruits.stream()
			    .flatMap(fruit -> fruit.getVarieties().stream()) // get stream of all varieties
			    .collect(Collectors.toList()); // collect them in a list

			//System.out.println(allVarieties);


			double totalQuantity = fruits.stream()
				    .map(Fruit::getPrice) // transform to quantity
				    .reduce(0.0, Double::sum); // reduce to sum
				//System.out.println("Total quantity of all fruits: " + totalQuantity);


			
			// Filter red fruits and transform to uppercase, then sort
			List<String> redFruits = fruits.stream()
			    .filter(fruit -> "Red".equalsIgnoreCase(fruit.getColor())) // filter out non-red fruits
			    .map(fruit -> fruit.getFruitName().toUpperCase()) // transform names to uppercase
			    .sorted() // sort them
			    .collect(Collectors.toList()); // collect results to a list

			//System.out.println(redFruits);
		
			
			Map<String, Double> totalPriceByColor = fruits.stream()
				    .collect(Collectors.groupingBy(
				        Fruit::getColor, 
				        Collectors.summingDouble(fruit -> fruit.getPrice() * fruit.getQuantity())
				    ));

				//totalPriceByColor.forEach((key, value) -> 
				    //System.out.println("Color: " + key + ", Total Price: " + value));


			
			System.out.println(totalPriceByColor);
				
			Double value = totalPriceByColor.get("Red");
			//System.out.println(value);
			
			// copy only keys from map
			
			System.out.println("-----------");
			Set<String> keys = totalPriceByColor.keySet();
			System.out.println(keys);
			keys.forEach(key->{
				System.out.println(totalPriceByColor.get(key));
			});
			
			//----------------------
			
			
			Set<Entry<String, Double>> data = totalPriceByColor.entrySet();
			System.out.println(data);

			
			// Suppose you have a List of Products
			List<Product> products = Arrays.asList(
				    new Product(1, "Apple iPhone 13", "Newest model of iPhone with 128GB storage", 799.00),
				    new Product(2, "Samsung Galaxy S21", "Latest Samsung Galaxy model with 128GB storage", 699.99),
				    new Product(3, "Dell XPS 15", "Dell's high-end laptop with 16GB RAM and 512GB SSD", 1699.00),
				    new Product(4, "Asus ROG Zephyrus", "Gaming laptop with Nvidia RTX 3070 and 16GB RAM", 2449.00),
				    new Product(5, "Sony WH-1000XM4", "Industry leading noise cancelling headphones", 349.00),
				    new Product(6, "Apple Watch Series 7", "The latest smartwatch from Apple with heart rate monitor", 399.00),
				    new Product(7, "Amazon Echo Dot (4th generation)", "Smart speaker with Alexa", 49.99),
				    new Product(8, "Google Pixel 6", "Google's flagship phone with 128GB storage", 599.00),
				    new Product(9, "Apple iPad Pro (11-inch, Wi-Fi, 128GB)", "Apple's newest iPad model", 799.00),
				    new Product(10, "Nintendo Switch", "Popular gaming console with detachable controllers", 299.99)
				);

			

			double sumOfPrices = products.stream()
			                             .mapToDouble(Product::getPrice)
			                             .sum();

			System.out.println("The sum of all product prices is: " + sumOfPrices);
			
		
		

	}

}
