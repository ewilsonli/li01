package service;

import java.util.*;
import pojo.Course;
import pojo.CourseCatalog;

public interface CourseService {
   List<CourseCatalog> getAllCourseCatalog();
   /** @param course 
    * @param teacherIds */
   boolean createCourse(Course course, int[] teacherIds);

}