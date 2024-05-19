package com.exercise.SpringRepositories2.repositories;

import com.exercise.SpringRepositories2.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Questi sono dei linguaggi di programmazione"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
