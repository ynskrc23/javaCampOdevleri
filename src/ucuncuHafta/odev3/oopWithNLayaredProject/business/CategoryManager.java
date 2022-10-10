package ucuncuHafta.odev3.oopWithNLayaredProject.business;

import ucuncuHafta.odev3.oopWithNLayaredProject.core.logging.Logger;
import ucuncuHafta.odev3.oopWithNLayaredProject.dataAccess.CategoryDao;
import ucuncuHafta.odev3.oopWithNLayaredProject.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categoryList;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categoryList) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categoryList = categoryList;
    }

    public void add(Category category) throws Exception {
        for(Category c :categoryList){
            //iş kuralları
            if(c.getName().equals(category.getName())){
                throw new Exception("Kategori isimleri aynı olamaz");
            }
        }

        categoryList.add(category);

        for(Logger logger: loggers) {
            logger.log(category.getName());
        }
    }
}
