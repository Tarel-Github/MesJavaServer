package me.makecorporation.mes.repository;

import me.makecorporation.mes.domain.DataTracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataTrackingRepository extends JpaRepository<DataTracking, Long> {
}
