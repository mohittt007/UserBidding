package com.cars24.bidding.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.cars24.bidding.domain.AuctionableItem;

public interface AuctionItemService {

	public List<AuctionableItem> getAllAutionableItems(Integer pageNumber, Integer offset);
}
