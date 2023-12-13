package br.edu.infnet.jobhunter.model.repository;

import br.edu.infnet.jobhunter.model.domain.Progress;
import br.edu.infnet.jobhunter.model.domain.SavedJob;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface SavedJobRepository extends CrudRepository<SavedJob, Long> {
    Collection<SavedJob> findAll();

    @Modifying
    @Query("UPDATE SavedJob s SET s.progress = :progress WHERE s.id = :id")
    void updateProgress(@Param("id") Long id, @Param("progress") Progress progress);
}
