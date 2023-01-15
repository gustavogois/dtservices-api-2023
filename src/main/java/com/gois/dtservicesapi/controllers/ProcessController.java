package com.gois.dtservicesapi.controllers;

import com.gois.dtservicesapi.model.ProcessDT;
import com.gois.dtservicesapi.services.ProcessService;
import com.google.common.base.Preconditions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/process")
public class ProcessController {

    ProcessService service;

    public ProcessController(ProcessService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProcessDT create(@RequestBody ProcessDT process) {
        Preconditions.checkNotNull(process);
        return service.create(process);
    }

}
