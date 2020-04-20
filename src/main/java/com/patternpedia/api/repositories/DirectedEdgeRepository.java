package com.patternpedia.api.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.patternpedia.api.entities.DirectedEdge;
import com.patternpedia.api.entities.Pattern;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface DirectedEdgeRepository extends JpaRepository<DirectedEdge, UUID> {
    Optional<List<DirectedEdge>> findBySource(Pattern pattern);

    Optional<List<DirectedEdge>> findByTarget(Pattern pattern);

    boolean existsBySourceIdAndTargetId(UUID sourcePatternId, UUID targetPatternId);
}
