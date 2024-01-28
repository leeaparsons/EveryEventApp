package com.example.everyevent.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.everyevent.entity.EveryEvent;
import com.example.everyevent.repo.EveryEventRepository;

@Service
public class EveryEventService {
    private final EveryEventRepository repository;

    public EveryEventService(EveryEventRepository repository) {
        this.repository = repository;
    }

    public List<EveryEvent> findAll(){
        return repository.findAll();
    }
}
