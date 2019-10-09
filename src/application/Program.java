package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;
import model.services.CalculationService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		String pathIn = "C:\\Temp\\In\\products.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			Product x = CalculationService.max(list);
			System.out.println("Most expensive product:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

}
