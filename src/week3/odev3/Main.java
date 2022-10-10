package week3.odev3;

import week3.odev3.Service.CategoryManager;
import week3.odev3.Service.CourseManager;
import week3.odev3.core.loggers.HibernateLogger;
import week3.odev3.core.loggers.JdbcLogger;
import week3.odev3.core.loggers.Logger;
import week3.odev3.entities.Category;
import week3.odev3.entities.Course;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new JdbcLogger(), new HibernateLogger()};

        Course course1 = new Course();
        course1.setCourseName("(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA");
        course1.setPrice(10);

        Course course2 = new Course();
        course2.setCourseName("Senior Yazılım Geliştirici Yetiştirme Kampı");
        course2.setPrice(-5); // negatif deger girildiginde 0 olarak ayarlanir

        Course course3 = new Course();
        course3.setCourseName("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)");
        course3.setPrice(20);

        Course course4 = new Course();
        course4.setCourseName("Yazılım Geliştirici Yetiştirme Kampı (JavaScript)");
        course4.setPrice(55);

        Category category1 = new Category();
        category1.setCategoryName("Programlama");

        Category category2 = new Category();
        category2.setCategoryName("Programlama");

        CategoryManager categoryManager = new CategoryManager();
        categoryManager.createCategory(category1, loggers); //Kategori yaratildi: Programlama
        categoryManager.createCategory(category2, loggers); //Kategori zaten mevcut: Programlama

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1, loggers); //Kurs eklendi: (2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA
        courseManager.addCourse(course2, loggers); //Kurs eklendi: Senior Yazılım Geliştirici Yetiştirme Kampı
        courseManager.addCourse(course3, loggers); //Kurs eklendi: Yazılım Geliştirici Yetiştirme Kampı (JavaScript)
        courseManager.addCourse(course4, loggers); //Kurs zaten mevcut: Yazılım Geliştirici Yetiştirme Kampı (JavaScript)


    }
}
