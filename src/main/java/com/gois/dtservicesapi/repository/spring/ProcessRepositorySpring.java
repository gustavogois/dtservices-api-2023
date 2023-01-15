package com.gois.dtservicesapi.repository.spring;


import com.gois.dtservicesapi.model.ProcessDT;
import com.gois.dtservicesapi.repository.data.ProcessData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepositorySpring extends JpaRepository<ProcessData, Long> {
}
