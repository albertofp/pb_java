package br.edu.infnet.jobhunter.model.domain;

import java.util.Arrays;

public class Job {
    String title;
    String description;
    Double salary;
    String location;
    String[] stack;
    Boolean remote;
    Integer experience;
    String company;
    String link;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String[] getStack() {
        return stack;
    }

    public void setStack(String[] stack) {
        this.stack = stack;
    }

    public Boolean getRemote() {
        return remote;
    }

    public void setRemote(Boolean remote) {
        this.remote = remote;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", stack=" + Arrays.toString(stack) +
                ", remote=" + remote +
                ", experience=" + experience +
                ", company='" + company + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
