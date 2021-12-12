package io.github.soufianeodf.springbootrrwebpostgres.repository;

import com.fasterxml.jackson.databind.JsonNode;
import io.github.soufianeodf.springbootrrwebpostgres.entity.RrwebEvents;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RrwebRepository extends CrudRepository<RrwebEvents, Long> {

    @Query(value = "SELECT event FROM RrwebEvents")
    List<JsonNode> findListOfEvents();
}
