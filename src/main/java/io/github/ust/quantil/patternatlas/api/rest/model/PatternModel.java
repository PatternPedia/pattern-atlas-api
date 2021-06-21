package io.github.ust.quantil.patternatlas.api.rest.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.github.ust.quantil.patternatlas.api.entities.Pattern;
import io.github.ust.quantil.patternatlas.api.entities.PatternLanguage;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class PatternModel {

    protected UUID id;

    protected String uri;

    protected String name;

    protected String iconUrl;

    protected UUID patternLanguageId;

    protected String patternLanguageName;

    @JsonIgnore
    protected Pattern pattern;

    private PatternModel(Pattern pattern) {
        this.pattern = pattern;
        this.id = pattern.getId();
        this.uri = pattern.getUri();
        this.name = pattern.getName();
        this.iconUrl = pattern.getIconUrl();
        PatternLanguage patternLanguage = pattern.getPatternLanguage();
        this.patternLanguageId = patternLanguage.getId();
        this.patternLanguageName = patternLanguage.getName();
    }

    public static PatternModel from(Pattern pattern) {
        return new PatternModel(pattern);
    }
}
