package br.edu.infnet.jobhunter.model.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    public User() {
        this.id = UUID.randomUUID().toString();
    }

    String name;
    String email;
    AuthMethod auth;
    List<SavedJob> savedJobs;
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
