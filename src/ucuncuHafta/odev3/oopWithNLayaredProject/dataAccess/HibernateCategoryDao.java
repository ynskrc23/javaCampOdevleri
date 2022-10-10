package ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess;

import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

    public void add(Category category){
        System.out.println("Category Hibernate ile veritabanına eklendi");
    }
}
