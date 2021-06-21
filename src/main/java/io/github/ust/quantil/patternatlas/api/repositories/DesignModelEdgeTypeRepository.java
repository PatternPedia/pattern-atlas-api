package io.github.ust.quantil.patternatlas.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.ust.quantil.patternatlas.api.entities.designmodel.DesignModelEdgeType;

public interface DesignModelEdgeTypeRepository extends JpaRepository<DesignModelEdgeType, String> {

    Optional<DesignModelEdgeType> findTopByName(String name);
}
