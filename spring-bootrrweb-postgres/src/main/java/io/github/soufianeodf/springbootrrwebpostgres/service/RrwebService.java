package io.github.soufianeodf.springbootrrwebpostgres.service;

import com.fasterxml.jackson.databind.JsonNode;
import io.github.soufianeodf.springbootrrwebpostgres.entity.RrwebEvents;
import io.github.soufianeodf.springbootrrwebpostgres.repository.RrwebRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RrwebService {

    RrwebRepository rrwebRepository;

    @Autowired
    public RrwebService(RrwebRepository rrwebRepository) {
        this.rrwebRepository = rrwebRepository;
    }

    public List<JsonNode> findListOfEvents() {
        return rrwebRepository.findListOfEvents();
    }

    public Iterable<RrwebEvents> saveAll(Iterable<RrwebEvents> rrwebEvents) {
        return rrwebRepository.saveAll(rrwebEvents);
    }
}
