package me.makecorporation.mes.service;

import lombok.RequiredArgsConstructor;
import me.makecorporation.mes.domain.Schedule;
import me.makecorporation.mes.dto.ScheduleRequest;
import me.makecorporation.mes.dto.ScheduleResponse;
import me.makecorporation.mes.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleResponse createSchedule(ScheduleRequest request) {
        Schedule schedule = new Schedule(request.getJobName(), request.getStartDate(), request.getEndDate());
        scheduleRepository.save(schedule);
        return new ScheduleResponse(schedule);
    }

    public List<ScheduleResponse> getAllSchedules() {
        return scheduleRepository.findAll().stream()
                .map(ScheduleResponse::new)
                .collect(Collectors.toList());
    }

    public ScheduleResponse getScheduleById(Long id) {
        Schedule schedule = scheduleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Schedule not found: " + id));
        return new ScheduleResponse(schedule);
    }

    public void deleteSchedule(Long id) {
        scheduleRepository.deleteById(id);
    }
}
