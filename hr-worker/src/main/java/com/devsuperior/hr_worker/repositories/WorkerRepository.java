package com.devsuperior.hr_worker.repositories;

import com.devsuperior.hr_worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

    Worker findWorkerById(Long id);
}
