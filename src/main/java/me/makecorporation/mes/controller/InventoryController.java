package me.makecorporation.mes.controller;

import me.makecorporation.mes.dto.InventoryResponse;
import me.makecorporation.mes.service.InventoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping
    public ResponseEntity<List<InventoryResponse>> getAllInventoryItems() {
        List<InventoryResponse> inventoryItems = inventoryService.getAllInventoryItems();
        return ResponseEntity.ok(inventoryItems);
    }
}
