package br.edu.infnet.jobhunter.model.service;

import br.edu.infnet.jobhunter.model.domain.Job;
import br.edu.infnet.jobhunter.model.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class JobService {
    private final JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public void include(Job job) {
        jobRepository.save(job);
    }

    public Collection<Job> list() {
        return jobRepository.findAll();
    }
}
