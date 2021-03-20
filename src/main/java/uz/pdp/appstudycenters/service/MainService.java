package uz.pdp.appstudycenters.service;

import org.springframework.stereotype.Service;
import uz.pdp.appstudycenters.entity.ActiveCourse;
import uz.pdp.appstudycenters.entity.Course;
import uz.pdp.appstudycenters.repository.ActiveCourseRepository;
import uz.pdp.appstudycenters.repository.CourseRepository;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MainService {

    final ActiveCourseRepository activeCourseRepository;
    final CourseRepository courseRepository;


    public MainService(ActiveCourseRepository activeCourseRepository, CourseRepository courseRepository) {
        this.activeCourseRepository = activeCourseRepository;
        this.courseRepository = courseRepository;
    }

    public List<Course> search(String name) {
        Optional<List<Course>> optionalCourseList = courseRepository.findAllByActiveId(name);
        if (!optionalCourseList.isPresent()){
            return new ArrayList<>();
        }
        List<Course> courseList = optionalCourseList.get();

        return courseList;
    }

//    public List<Course> searchForegionAndName(String name, String region) {
//
//    }
}
