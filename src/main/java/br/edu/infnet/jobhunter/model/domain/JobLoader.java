package br.edu.infnet.jobhunter.model.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Component
public class JobLoader implements ApplicationRunner {

    private Map<String, Job> jobMap = new HashMap<>();

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("files/jobs.txt");
        BufferedReader bufferedReader = new BufferedReader(file);

        String line = bufferedReader.readLine();
        String[] fields;

        while (line != null) {
            fields = line.split(";");

            Job job = new Job();
            job.setTitle(fields[0]);
            job.setDescription(fields[1]);
            job.setSalary(Double.parseDouble(fields[2]));
            job.setLocation(fields[3]);
            job.setStack(fields[4].split(","));
            job.setRemote(Boolean.parseBoolean(fields[5]));
            job.setExperience(Integer.parseInt(fields[6]));
            job.setCompany(fields[7]);
            job.setLink(fields[8]);

            jobMap.put(job.getTitle(), job);
            line = bufferedReader.readLine();
        }

        for (Job job : jobMap.values()) {
            System.out.println("Job loaded: " + job);
        }

        bufferedReader.close();
    }
}
