package com.cars24.bidding.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBidRequest {

	private Integer userId;
	private Integer itemCode;
	private Double bidAmount;
	private Double highestBidAmount;
	private Double itemStepRate;
	
	
}
