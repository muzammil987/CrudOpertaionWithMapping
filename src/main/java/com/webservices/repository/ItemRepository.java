package com.webservices.repository;

import org.springframework.data.repository.CrudRepository;

import com.webservices.entity.Item;

public interface ItemRepository extends CrudRepository<Item, Long>{

}
