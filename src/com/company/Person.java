package com.company;

public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;

    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        job.setRole("Java Web Developer");
        job.setId(13453);

        this.education=new Education();
        education.setListOfSchools();
    }
    public long getSalary() {
        return job.getSalary();
    }

    @Override
    public String toString() {
        return job + "\n\n" + education;
    }
}