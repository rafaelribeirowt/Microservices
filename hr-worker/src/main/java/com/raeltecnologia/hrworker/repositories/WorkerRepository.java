package com.raeltecnologia.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.raeltecnologia.hrworker.entities.Worker;

public interface WorkerRepository extends  JpaRepository<Worker, Long>  {
	
	

}
