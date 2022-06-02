package com.webservices.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.webservices.entity.Cart;

import lombok.Data;

@Data
public class CartDto {
	private Long id;
    private String name;
    private List<ItemDto> itemsDto = new ArrayList<>();

    public static CartDto from(Cart cart){
        CartDto cartDto = new CartDto();
        cartDto.setId(cart.getId());
        cartDto.setName(cart.getName());
        cartDto.setItemsDto(cart.getItems().stream().map(ItemDto::from).collect(Collectors.toList()));
        return cartDto;
    }

}
