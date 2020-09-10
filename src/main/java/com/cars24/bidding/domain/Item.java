package com.cars24.bidding.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Item {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itemCode;
	@Column
	private Double minimumBasePrice;
	@Column
	private Double stepRate;
	@Column
	private String itemName;
	@Column
	private Boolean autionStatus;
	@Column
	private Double highestBidAmount;
}
