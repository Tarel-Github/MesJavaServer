package me.makecorporation.mes.controller;

import me.makecorporation.mes.dto.EquipmentRequest;
import me.makecorporation.mes.dto.EquipmentResponse;
import me.makecorporation.mes.service.EquipmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/equipment")
public class EquipmentController {
    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @PostMapping
    public ResponseEntity<EquipmentResponse> addEquipment(@RequestBody EquipmentRequest request) {
        EquipmentResponse equipment = equipmentService.addEquipment(request);
        return ResponseEntity.ok(equipment);
    }

    @GetMapping
    public ResponseEntity<List<EquipmentResponse>> getAllEquipment() {
        List<EquipmentResponse> equipmentList = equipmentService.getAllEquipment();
        return ResponseEntity.ok(equipmentList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEquipment(@PathVariable Long id) {
        equipmentService.deleteEquipment(id);
        return ResponseEntity.noContent().build();
    }
}
