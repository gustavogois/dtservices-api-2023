package com.gois.dtservicesapi.repository.impl;

import com.gois.dtservicesapi.model.ProcessDT;
import com.gois.dtservicesapi.repository.ProcessRepository;
import com.gois.dtservicesapi.repository.data.ProcessData;
import com.gois.dtservicesapi.repository.mapper.PersistenceMapper;
import com.gois.dtservicesapi.repository.spring.ProcessRepositorySpring;
import org.springframework.stereotype.Repository;

@Repository
public class ProcessRepositoryImpl implements ProcessRepository {

    ProcessRepositorySpring repository;

    public ProcessRepositoryImpl(ProcessRepositorySpring repository) {
        this.repository = repository;
    }

    @Override
    public ProcessDT create(ProcessDT process) {
        ProcessData processData = PersistenceMapper.INSTANCE.toData(process);
        ProcessData processSaved = repository.save(processData);
        return PersistenceMapper.INSTANCE.fromData(processSaved);
    }
}
