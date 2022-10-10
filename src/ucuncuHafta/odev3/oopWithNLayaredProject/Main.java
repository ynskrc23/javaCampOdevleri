package ucuncuHafta.odev3.oopWithNLayaredProject;

import ucuncuHafta.odev3.oopWithNLayaredProject.business.CategoryManager;
import ucuncuHafta.odev3.oopWithNLayaredProject.business.CourseManager;
import ucuncuHafta.odev3.oopWithNLayaredProject.business.InstructorManager;
import ucuncuHafta.odev3.oopWithNLayaredProject.core.logging.DatabaseLogger;
import ucuncuHafta.odev3.oopWithNLayaredProject.core.logging.FileLogger;
import ucuncuHafta.odev3.oopWithNLayaredProject.core.logging.Logger;
import ucuncuHafta.odev3.oopWithNLayaredProject.core.logging.MailLogger;
import ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess.HibernateCategoryDao;
import ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess.HibernateInstructorDao;
import ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess.JdbcCourseDao;
import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Category;
import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Course;
import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(), new FileLogger() ,new MailLogger()};

        System.out.println("-----------Instructor-------------");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        Instructor instructor1 = new Instructor(1,"engin demiroğ");
        Instructor instructor2 = new Instructor(2,"ali veli");
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);

        System.out.println("-----------Course-------------");
        Course course1 = new Course(1,"c#",25.99);
        Course course2 = new Course(2,"java",49.99);
        Course course3 = new Course(3,"php",-23);
        List<Course> courseList = new ArrayList<>();
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers,courseList);
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);

        System.out.println("-----------Category-------------");
        Category category1 = new Category(1,"web");
        Category category2 = new Category(2,"masaustu");
        Category category3 = new Category(3,"web");
        List<Category> categoryList = new ArrayList<>();
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers,categoryList);
        categoryManager.add(category1);
        categoryManager.add(category2);
        categoryManager.add(category3);

    }
}
