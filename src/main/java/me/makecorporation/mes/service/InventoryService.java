package me.makecorporation.mes.service;

import lombok.RequiredArgsConstructor;
import me.makecorporation.mes.dto.InventoryResponse;
import me.makecorporation.mes.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public List<InventoryResponse> getAllInventoryItems() {
        return inventoryRepository.findAll().stream()
                .map(InventoryResponse::new)
                .collect(Collectors.toList());
    }
}
