package com.patternpedia.api.rest.model.issue;

import com.patternpedia.api.entities.issue.Issue;
import com.patternpedia.api.entities.issue.IssueRating;
import com.patternpedia.api.rest.model.shared.AuthorModel;
import com.patternpedia.api.rest.model.shared.CommentModel;
import com.patternpedia.api.rest.model.shared.RatingModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class IssueModel {

    private UUID id;
    private String uri;
    private String name;
    private String description;
    private String version;
    // RESPONSE
    private Collection<UUID> upVotes = new ArrayList<>();
    private Collection<UUID> downVotes = new ArrayList<>();
    private List<AuthorModel> authors = new ArrayList<>();
    private List<CommentModel> comments = new ArrayList<>();

    public IssueModel(Issue issue) {
        this.id = issue.getId();
        this.uri = issue.getUri();
        this.name = issue.getName();
        this.description = issue.getDescription();
        this.version = issue.getVersion();
        //Response
        for (IssueRating issueRating: issue.getUserRating()) {
            if (issueRating.getRating() == 1)
                this.upVotes.add(issueRating.getUser().getId());
            if (issueRating.getRating() == -1)
                this.downVotes.add(issueRating.getUser().getId());
        }
        this.authors = issue.getAuthors().stream().map(issueAuthor -> new AuthorModel(issueAuthor.getUser(), issueAuthor.getRole())).collect(Collectors.toList());
        this.comments = issue.getComments().stream().map(issueComment -> CommentModel.from(issueComment)).collect(Collectors.toList());
    }
}