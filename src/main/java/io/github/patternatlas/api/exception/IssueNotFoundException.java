package io.github.patternatlas.api.exception;

import java.util.UUID;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@ResponseStatus(HttpStatus.NOT_FOUND)
public class IssueNotFoundException extends ResourceNotFoundException {

    public IssueNotFoundException(String message) {
        super(message);
    }

    public IssueNotFoundException(UUID issueId) {
        super(String.format("Issue \"%s\" not found!", issueId));
    }
}
