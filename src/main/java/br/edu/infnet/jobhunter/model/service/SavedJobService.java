package br.edu.infnet.jobhunter.model.service;

import br.edu.infnet.jobhunter.model.domain.Job;
import br.edu.infnet.jobhunter.model.domain.Progress;
import br.edu.infnet.jobhunter.model.domain.SavedJob;
import br.edu.infnet.jobhunter.model.repository.SavedJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class SavedJobService {
    private final SavedJobRepository savedJobRepository;

    @Autowired
    public SavedJobService(SavedJobRepository savedJobRepository) {
        this.savedJobRepository = savedJobRepository;
    }

    public void include(Job job) {
        if (job instanceof SavedJob) {
            SavedJob savedJob = (SavedJob) job;
            savedJob.setProgress(Progress.NotApplied);
            savedJobRepository.save(savedJob);
        } else {
            throw new IllegalArgumentException("Only SavedJob instances are allowed.");
        }
    }

    public Collection<SavedJob> list() {
        return savedJobRepository.findAll();
    }

    public void updateProgress(Long id, Progress progress) {
        savedJobRepository.updateProgress(id, progress);
    }
}
