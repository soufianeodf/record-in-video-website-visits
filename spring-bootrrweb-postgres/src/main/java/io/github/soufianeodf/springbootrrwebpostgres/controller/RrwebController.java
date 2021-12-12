package io.github.soufianeodf.springbootrrwebpostgres.controller;

import com.fasterxml.jackson.databind.JsonNode;
import io.github.soufianeodf.springbootrrwebpostgres.entity.RrwebEvents;
import io.github.soufianeodf.springbootrrwebpostgres.service.RrwebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RrwebController {

    RrwebService rrwebService;

    @Autowired
    public RrwebController(RrwebService rrwebService) {
        this.rrwebService = rrwebService;
    }

    @GetMapping
    @CrossOrigin(origins= {"*"})
    public List<JsonNode> findListOfEvents() {
        return rrwebService.findListOfEvents();
    }

    @PostMapping(value = "/save",produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins= {"*"})
    public Iterable<RrwebEvents> saveEvent(@Valid @RequestBody Iterable<RrwebEvents> rrwebEvents) {
        return rrwebService.saveAll(rrwebEvents);
    }
}
