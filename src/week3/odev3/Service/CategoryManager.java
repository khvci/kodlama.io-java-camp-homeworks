package week3.odev3.Service;

import week3.odev3.entities.Category;
import java.util.ArrayList;

public class CategoryManager {
    ArrayList<String> categories = new ArrayList<>();

    public void createCategory(Category category) {
        String categoryName = category.getCategoryName();
        if (doesCategoryExists(categoryName)) {
            System.out.println("Kategori zaten mevcut: " + categoryName);
            return;
        }
        categories.add(categoryName);
        System.out.println("Kategori yaratildi: " + categoryName);
    }

    private boolean doesCategoryExists(String categoryName) {
        for (String cat: categories) {
            if (categoryName.equals(cat)) {
                return true;
            }
        }
        return false;
    }

}
