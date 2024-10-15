package me.makecorporation.mes.service;

import lombok.RequiredArgsConstructor;
import me.makecorporation.mes.domain.Equipment;
import me.makecorporation.mes.dto.EquipmentRequest;
import me.makecorporation.mes.dto.EquipmentResponse;
import me.makecorporation.mes.repository.EquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EquipmentService {
    private final EquipmentRepository equipmentRepository;

    public EquipmentResponse addEquipment(EquipmentRequest request) {
        Equipment equipment = new Equipment(request.getName(), request.getType(), request.getStatus());
        equipmentRepository.save(equipment);
        return new EquipmentResponse(equipment);
    }

    public List<EquipmentResponse> getAllEquipment() {
        return equipmentRepository.findAll().stream()
                .map(EquipmentResponse::new)
                .collect(Collectors.toList());
    }

    public void deleteEquipment(Long id) {
        equipmentRepository.deleteById(id);
    }
}
