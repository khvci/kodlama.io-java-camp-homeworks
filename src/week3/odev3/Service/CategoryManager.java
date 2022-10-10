package week3.odev3.Service;

import week3.odev3.core.loggers.Logger;
import week3.odev3.entities.Category;
import java.util.ArrayList;

public class CategoryManager {
    ArrayList<String> categories = new ArrayList<>();

    public void createCategory(Category category, Logger[] loggers) {
        String categoryName = category.getCategoryName();
        String message;
        if (doesCategoryExists(categoryName)) {
            message = "Kategori zaten mevcut: " + categoryName;
            //System.out.println(message);
            log(loggers, message);
            return;
        }
        categories.add(categoryName);
        message ="Kategori yaratildi: " + categoryName;
        log(loggers, message);
        //System.out.println(message);
    }

    private boolean doesCategoryExists(String categoryName) {
        for (String cat: categories) {
            if (categoryName.equals(cat)) {
                return true;
            }
        }
        return false;
    }

    public void log(Logger[] loggers, String message) {
        for (Logger logger:loggers) {
            logger.log(message);
        }
    }

}
