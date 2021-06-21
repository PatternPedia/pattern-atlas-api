package io.github.ust.quantil.patternatlas.api.rest.model;

import java.util.List;

import io.github.ust.quantil.patternatlas.api.entities.DiscussionComment;
import io.github.ust.quantil.patternatlas.api.entities.DiscussionTopic;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DiscussionTopicModel {
    private DiscussionTopic discussionTopic;
    private List<DiscussionComment> discussionComments;

    public DiscussionTopicModel(DiscussionTopic discussionTopic, List<DiscussionComment> discussionComments) {
        this.discussionTopic = discussionTopic;
        this.discussionComments = discussionComments;
    }
}