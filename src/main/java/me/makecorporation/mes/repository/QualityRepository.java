package me.makecorporation.mes.repository;

import me.makecorporation.mes.domain.Quality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualityRepository extends JpaRepository<Quality, Long> {
}