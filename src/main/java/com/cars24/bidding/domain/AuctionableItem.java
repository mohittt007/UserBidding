package com.cars24.bidding.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuctionableItem {
	
	Integer itemCode;
	Double highestBidAmount;
	Double stepRate;

}
