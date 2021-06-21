package io.github.ust.quantil.patternatlas.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import io.github.ust.quantil.patternatlas.api.entities.candidate.Candidate;
import io.github.ust.quantil.patternatlas.api.entities.candidate.rating.CandidateRating;
import io.github.ust.quantil.patternatlas.api.entities.candidate.rating.CandidateRatingKey;
import io.github.ust.quantil.patternatlas.api.entities.user.UserEntity;

@RepositoryRestResource(exported = false)
public interface CandidateRatingRepository extends JpaRepository<CandidateRating, CandidateRatingKey> {

    List<CandidateRating> findAllByCandidate(Candidate candidate);

    List<UserEntity> findAllByUser(UserEntity user);

    CandidateRating findByCandidateAndUser(Candidate candidate, UserEntity user);
}