package com.example.firstjobapp.job;

import org.springframework.stereotype.Service;

import java.util.List;


public interface JobService {

    List<Job> findAll();
    void createJob(Job job);
    boolean deleteJobById(Long id);

    boolean updateJob(Long id, Job updatedJob);
}
