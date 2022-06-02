package com.webservices.repository;

import org.springframework.data.repository.CrudRepository;

import com.webservices.entity.Cart;

public interface CartRepository extends CrudRepository<Cart, Long>{

}
