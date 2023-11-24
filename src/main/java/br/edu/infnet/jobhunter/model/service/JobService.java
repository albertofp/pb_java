package br.edu.infnet.jobhunter.model.service;

import br.edu.infnet.jobhunter.model.domain.Job;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class JobService {
    private Map<String, Job> jobMap = new HashMap<>();

    public void include(Job job) {
        jobMap.put(job.getTitle(), job);
    }

    public Collection<Job> list() {
        return jobMap.values();
    }
}
