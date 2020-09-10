package com.cars24.bidding.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars24.bidding.domain.User;
import com.cars24.bidding.domain.UserBidRequest;
import com.cars24.bidding.domain.UserBidResponse;
import com.cars24.bidding.reposotory.UserRepository;

@Service
public class UserBiddingServiceImpl implements com.cars24.bidding.service.UserBiddingService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserBidResponse placeUserBid(UserBidRequest userBidRequest) throws Exception {
		System.out.println("dasdasd");
		validateUser(userBidRequest.getUserId());
		return null;
	}

	private void validateUser(Integer userId) throws Exception {
		Optional<User> user = userRepository.findById(userId);
		if(!user.isPresent()){
			throw new Exception("Not a regestred user");
		}
		
	}

}
