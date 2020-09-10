package com.cars24.bidding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cars24.bidding.domain.AuctionableItem;
import com.cars24.bidding.service.AuctionItemService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AuctionItemController {
	
	@Autowired
	AuctionItemService auctionItemService;
	
	@GetMapping("/auction")
	public List<AuctionableItem> getAllAutionableItems(@RequestParam String status, @RequestParam Integer pageNumber, @RequestParam Integer offset){
		return auctionItemService.getAllAutionableItems(pageNumber, offset);
	}
}
