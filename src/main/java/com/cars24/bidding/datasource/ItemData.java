package com.cars24.bidding.datasource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cars24.bidding.domain.Item;

/**
 * Class to return items present in the system
 *
 */
@Component
public class ItemData {

	public List<Item> getItems(){
		List<Item> listOfItems = new ArrayList<>();
		/*listOfItems.add(new Item(1, 1000.0, 200.0, "Mouse", true));
		listOfItems.add(new Item(2, 200.0, 50.0, "Lock", false));
		listOfItems.add(new Item(3, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(4, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(5, 200.0, 50.0, "Cover", true));
		listOfItems.add(new Item(6, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(7, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(8, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(9, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(10, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(11, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(12, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(13, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(14, 100.0, 15.0, "key", true));
		listOfItems.add(new Item(15, 100.0, 15.0, "key", true));*/
		
		return listOfItems;
		
	}
}
