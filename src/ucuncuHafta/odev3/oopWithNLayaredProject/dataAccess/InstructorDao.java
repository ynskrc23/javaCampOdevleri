package ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess;

import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Instructor;

import java.util.List;

public interface InstructorDao {
    void add(Instructor instructor);

    List<Instructor> getInstructorList();
}
