package com.patternpedia.api.exception;

import com.patternpedia.api.entities.PatternLanguage;
import com.patternpedia.api.entities.PatternView;

import java.util.UUID;

public class UndirectedEdgeNotFoundException extends RuntimeException {
    public UndirectedEdgeNotFoundException(String message) {
        super(message);
    }

    public UndirectedEdgeNotFoundException(PatternView patternView, UUID undirectedEdgeId) {
        super(String.format("UndirectedEdge \"%s\" is not part of PatternView \"%s\"", undirectedEdgeId, patternView.getId()));
    }

    public UndirectedEdgeNotFoundException(PatternLanguage patternLanguage, UUID undirectedEdgeId) {
        super(String.format("UndirectedEdge \"%s\" is not part of PatternLanguage \"%s\"", undirectedEdgeId, patternLanguage.getId()));
    }
}