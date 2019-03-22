package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Food {
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    private String foodId;
    private String foodName;
    private String description;
    private Category category;


    private double price;
    private String createAt = format.format(new Date());

    @Override
    public String toString() {
        return String.format("%-10s|%-10s|%-10s|%-15s|%-10f|%-10s",
                this.foodId, this.foodName, this.category.getName(), this.description, this.price, this.createAt);
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreateAt() {
        return createAt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
