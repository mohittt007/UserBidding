package com.cars24.bidding.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {

	Integer itemCode;
	Double minimumBasePrice;
	Double stepRate;
}
