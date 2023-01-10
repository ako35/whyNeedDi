package com.tpe.app;

import com.tpe.domain.Course;
import com.tpe.repo.CloudRepo;
import com.tpe.repo.LocalRepo;
import com.tpe.repo.Repo;
import com.tpe.service.CourseService;
import com.tpe.service.MeetService;
import com.tpe.service.ZoomService;

public class MyApp {

    public static void main(String[] args) {

        Course course=new Course();
        course.setName("Advanced Java");

        // dersin zoom ile anlatilmasini istiyoruz.
//        ZoomService zoomService=new ZoomService();
//        zoomService.teachCourse(course);

        // dersin meet ile anlatilmasini istiyoruz.
//        MeetService meetService=new MeetService();
//        meetService.teachCourse(course);

//        // daha kolay bakim ve gelistirme icin interface
//        CourseService service=new ZoomService();
//        service.teachCourse(course);
//
//        // dersi buluta kaydetmek istiyoruz.
//        service.saveCourse(course);

        Repo repo=new LocalRepo();
        CourseService service=new ZoomService(repo);
        service.teachCourse(course);
        service.saveCourse(course);


    }
}
