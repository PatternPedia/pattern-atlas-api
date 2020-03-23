package com.patternpedia.api.rest.model;

import java.net.URL;
import java.util.UUID;

import com.patternpedia.api.entities.pattern.language.PatternLanguage;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class PatternLanguageModel {
    private UUID id;

    private String uri;

    private String name;

    private URL logo;

    private int patternCount;

    public static PatternLanguageModel toModel(PatternLanguage patternLanguage) {
        PatternLanguageModel model = new PatternLanguageModel();
        model.setId(patternLanguage.getId());
        model.setUri(patternLanguage.getUri());
        model.setName(patternLanguage.getName());
        model.setLogo(patternLanguage.getLogo());
        model.setPatternCount(patternLanguage.getPatterns().size());
        return model;
    }
}
