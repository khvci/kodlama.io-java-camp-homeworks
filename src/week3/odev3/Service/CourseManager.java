package week3.odev3.Service;

import week3.odev3.core.loggers.Logger;
import week3.odev3.entities.Course;
import java.util.HashMap;

public class CourseManager {
    HashMap<String, Integer> courses = new HashMap<>();

    public void addCourse(Course course, Logger[] loggers) {
        String courseName = course.getCourseName();
        String message;
        if (isCourseExists(course)) {
            message = "Kurs zaten mevcut: " + courseName;
            //System.out.println(message);
            log(loggers, message);
            return;
        }
        message = "Kurs eklendi: " + courseName;
        courses.put(courseName, course.getPrice());
        //System.out.println(message);
        log(loggers, message);

    }

    private boolean isCourseExists(Course course) {
        System.out.println();
        return courses.containsKey(course.getCourseName());
    }

    public void log(Logger[] loggers, String message) {
        for (Logger logger:loggers) {
            logger.log(message);
        }
    }


}
