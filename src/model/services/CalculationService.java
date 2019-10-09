package model.services;

import java.util.List;

import model.entities.Product;

public class CalculationService {
	public static Product max(List<Product> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		Product  max = list.get(0);
		for(Product item: list) {
			if(item.compareTo(max)>0) {
				max = item;
			}
		}
		return max;
	}
}
