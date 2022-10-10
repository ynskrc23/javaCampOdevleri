package ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess;

import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JdbcInstructorDao implements InstructorDao{
    private List<Instructor> instructorList = new ArrayList<>();
    public void add(Instructor instructor){

        System.out.println("Instructor jdbc ile veritabanına eklendi");
    }

    @Override
    public List<Instructor> getInstructorList() {
        return instructorList;
    }
}
