package br.edu.infnet.jobhunter.model.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {

    String name;
    String email;
    AuthMethod auth;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SavedJob> savedJobs = new ArrayList<>();

    public void addSavedJob(SavedJob savedJob) {
        savedJobs.add(savedJob);
        savedJob.setUser(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AuthMethod getAuth() {
        return auth;
    }

    public void setAuth(AuthMethod auth) {
        this.auth = auth;
    }

    public List<SavedJob> getSavedJobs() {
        return savedJobs;
    }

    public void setSavedJobs(ArrayList<SavedJob> savedJobs) {
        this.savedJobs = savedJobs;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", auth=" + auth +
                ", savedJobs=" + savedJobs +
                ", id='" + id + '\'' +
                '}';
    }
}
