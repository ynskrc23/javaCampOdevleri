package ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess;

import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

    public void add(Category category){
        System.out.println("Category jdbc ile veritabanına eklendi");
    }
}
