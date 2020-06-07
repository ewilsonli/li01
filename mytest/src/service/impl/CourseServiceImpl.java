package service.impl;

import mapper.CourseMapper;
import java.lang.annotation.*;
import pojo.Course;
import pojo.CourseCatalog;
import java.util.*;

public class CourseServiceImpl implements service.CourseService {
   private CourseMapper courseMapper;
   
   @Override
   public List<CourseCatalog> getAllCourseCatalog() {
   	// TODO Auto-generated method stub
   	return null;
   }
   
   /** @param course 
    * @param teacherIds */
   @Override
   public boolean createCourse(Course course, int[] teacherIds) {
   	// TODO Auto-generated method stub
   	return false;
   }

}