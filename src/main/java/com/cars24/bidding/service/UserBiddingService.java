package com.cars24.bidding.service;

import com.cars24.bidding.domain.UserBidRequest;
import com.cars24.bidding.domain.UserBidResponse;

public interface UserBiddingService {

	public UserBidResponse placeUserBid(UserBidRequest userBidRequest) throws Exception;
}
