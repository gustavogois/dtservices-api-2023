package com.gois.dtservicesapi.services.impl;

import com.gois.dtservicesapi.model.ProcessDT;
import com.gois.dtservicesapi.repository.ProcessRepository;
import com.gois.dtservicesapi.services.ProcessService;
import org.springframework.stereotype.Service;

@Service
public class ProcessServiceImpl implements ProcessService {

    ProcessRepository repository;

    public ProcessServiceImpl(ProcessRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProcessDT create(ProcessDT process) {
        return repository.create(process);
    }
}
