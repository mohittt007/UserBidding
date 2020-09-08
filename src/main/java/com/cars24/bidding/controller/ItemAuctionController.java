package com.cars24.bidding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ItemAuctionController {

	@GetMapping("/test")
	public void test(){
		System.out.println("dasdasdas");
	}
}
