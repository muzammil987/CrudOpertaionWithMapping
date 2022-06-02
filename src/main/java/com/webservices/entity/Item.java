package com.webservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.webservices.dto.ItemDto;

import lombok.Data;

@Data
@Entity
@Table(name = "Item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String serialNumber;
	@ManyToOne
	private Cart cart;
	
	public static Item form(ItemDto itemDto) {
		Item item = new Item();
		item.setSerialNumber(itemDto.getSerialNumber());
		return item;
	}
}
