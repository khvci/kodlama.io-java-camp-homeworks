package week3.odev3.entities;

public class Course {
    private String courseName;
    private int price;

    private Category category;

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = Math.max(price, 0); //fiyat 0'dan kucuk olamaz, negatif girilirse 0 olarak ayarlanir.
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
