package com.tpe.service;

import com.tpe.domain.Course;

public class MeetService implements  CourseService{

    @Override
    public void teachCourse(Course course){
        System.out.println(course.getName()+" dersi Meet ile anlatiliyor...");
    }

    @Override
    public void saveCourse(Course course) {

    }
}
