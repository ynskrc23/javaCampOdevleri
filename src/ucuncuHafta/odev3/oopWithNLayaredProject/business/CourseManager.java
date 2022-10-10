package ucuncuHafta.odev3.oopWithNLayaredProject.business;

import ucuncuHafta.odev3.oopWithNLayaredProject.core.logging.Logger;
import ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess.CourseDao;
import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courseList;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courseList) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courseList = courseList;
    }

    public void add(Course course) throws Exception {
        for(Course c : courseList){
            //iş kuralları
            if(c.getName().equals(course.getName())){
                throw new Exception("Kurs isimleri aynı olamaz");
            }
            if(course.getPrice() < 0) {
                throw new Exception("Kurs'un fiyatı 0 dan kücük olamaz");
            }
        }

        courseList.add(course);

        for(Logger logger: loggers) {
            logger.log(course.getName());
        }
    }

}
