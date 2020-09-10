package com.cars24.bidding.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cars24.bidding.datasource.ItemData;
import com.cars24.bidding.domain.AuctionableItem;
import com.cars24.bidding.domain.Item;
import com.cars24.bidding.reposotory.AuctionItemRepository;
import com.cars24.bidding.service.AuctionItemService;

@Service
public class AuctionItemServiceImpl implements AuctionItemService {
	
	@Autowired
	ItemData itemData;
	
	@Autowired
	AuctionItemRepository auctionItemRepository;

	@Override
	public List<AuctionableItem> getAllAutionableItems(Integer pageNumber, Integer offset) {
		
		Pageable pageable = PageRequest.of(pageNumber, offset);
		
		List<Item> items = auctionItemRepository.findAllByAutionStatus(true, pageable);//itemData.getItems().stream().filter(item -> item.getAutionStatus()).collect(Collectors.toList());
		return transformData(items);
	}

	private List<AuctionableItem> transformData(List<Item> items) {
		
		List<AuctionableItem> auctionableItemsList = new ArrayList<>();
		items.forEach(item -> {
			AuctionableItem auctionableItems = new AuctionableItem(item.getItemCode(), item.getHighestBidAmount(), item.getStepRate());
			auctionableItemsList.add(auctionableItems);
		});
		
		return auctionableItemsList;
	}

}
