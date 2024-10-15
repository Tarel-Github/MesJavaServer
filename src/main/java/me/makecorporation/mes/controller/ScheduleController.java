package me.makecorporation.mes.controller;

import me.makecorporation.mes.dto.ScheduleRequest;
import me.makecorporation.mes.dto.ScheduleResponse;
import me.makecorporation.mes.service.ScheduleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    // 새 스케쥴 생성 (포스트)
    @PostMapping
    public ResponseEntity<ScheduleResponse> createSchedule(@RequestBody ScheduleRequest request) {
        ScheduleResponse schedule = scheduleService.createSchedule(request);
        return ResponseEntity.ok(schedule);
    }

    // 모든 스케쥴 반환 (겟)
    @GetMapping
    public ResponseEntity<List<ScheduleResponse>> getAllSchedules() {
        List<ScheduleResponse> schedules = scheduleService.getAllSchedules();
        return ResponseEntity.ok(schedules);
    }

    // 특정 아이디의 스케쥴 반환 (겟)({id})
    @GetMapping("/{id}")
    public ResponseEntity<ScheduleResponse> getScheduleById(@PathVariable Long id) {
        ScheduleResponse schedule = scheduleService.getScheduleById(id);
        return ResponseEntity.ok(schedule);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchedule(@PathVariable Long id) {
        scheduleService.deleteSchedule(id);
        return ResponseEntity.noContent().build();
    }
}
