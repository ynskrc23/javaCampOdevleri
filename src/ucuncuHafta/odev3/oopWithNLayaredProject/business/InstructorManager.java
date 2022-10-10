package ucuncuHafta.odev3.oopWithNLayaredProject.business;

import ucuncuHafta.odev3.oopWithNLayaredProject.core.logging.Logger;
import ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess.InstructorDao;
import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception {
        instructorDao.add(instructor);

        for(Logger logger: loggers) {
            logger.log(instructor.getName());
        }
    }
}
