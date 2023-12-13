package br.edu.infnet.jobhunter.model.repository;

import br.edu.infnet.jobhunter.model.domain.Job;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

@Repository
public interface JobRepository extends CrudRepository<Job, Long>{
    Collection<Job> findAll();
}
