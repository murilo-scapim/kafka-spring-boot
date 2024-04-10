package com.app.dto;

import com.app.model.ShopItem;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShopItemDTO {

    private String productIdentifier;
    private Integer amount;
    private Float price;

    public static ShopItemDTO convert(ShopItem shopItem) {
        ShopItemDTO shopItemDTO = new ShopItemDTO();
        shopItemDTO.setProductIdentifier(
                shopItem.getProductIndentifier());
        shopItemDTO.setAmount(shopItem.getAmount());
        shopItemDTO.setPrice(shopItem.getPrice());
        return shopItemDTO;
    }
}