package com.cars24.bidding.reposotory;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars24.bidding.domain.Item;

@Repository
public interface AuctionItemRepository extends JpaRepository<Item, Integer>{
	
	public List<Item> findAllByAutionStatus(Boolean auctionStatus, Pageable pageable);

}
