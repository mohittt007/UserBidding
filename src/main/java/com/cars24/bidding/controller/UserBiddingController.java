package com.cars24.bidding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cars24.bidding.domain.UserBidRequest;
import com.cars24.bidding.domain.UserBidResponse;
import com.cars24.bidding.service.UserBiddingService;

@RestController
public class UserBiddingController {

	@Autowired
	UserBiddingService userBiddingService;
	
	@PostMapping("/placeUserBid")
	public UserBidResponse placeBid(@RequestBody UserBidRequest useBidRequest) throws Exception{
		return userBiddingService.placeUserBid(useBidRequest);
		
	}
}
