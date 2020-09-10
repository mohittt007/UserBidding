package com.cars24.bidding.reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars24.bidding.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
