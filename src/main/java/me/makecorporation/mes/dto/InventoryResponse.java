package me.makecorporation.mes.dto;

import lombok.Getter;
import me.makecorporation.mes.domain.Inventory;

@Getter
public class InventoryResponse {
    private Long id;
    private String itemName;
    private int quantity;
    private String location;

    public InventoryResponse(Inventory inventory) {
        this.id = inventory.getId();
        this.itemName = inventory.getItemName();
        this.quantity = inventory.getQuantity();
        this.location = inventory.getLocation();
    }
}
