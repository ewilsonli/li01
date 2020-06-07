package mapper;

import pojo.Course;
import pojo.CourseCatalog;
import java.util.*;

public interface CourseMapper {
   List<CourseCatalog> selectAllCourseCatalog();
   /** @param course */
   Course insertCourse(Course course);
   /** @param courseid 
    * @param teacherIds */
   int insertCourseTeachers(int courseid, int[] teacherIds);

}