package com.sunil.function.comparator;

import java.util.Comparator;

import com.sunil.function.dto.GroceryDTO;

public class QuantityComparator implements Comparator<GroceryDTO> {

	@Override
	public int compare(GroceryDTO o1, GroceryDTO o2) {
		Float f = o1.getQuantity();
		Float f1 = o2.getQuantity();
		return f.compareTo(f1);
	}

}
