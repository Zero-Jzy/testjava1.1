package controller;

import entity.Food;
import main.CategoryMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodController {
    private ArrayList<Food> foodArrayList = new ArrayList<>();
    private CategoryMenu categoryMenu = new CategoryMenu();

    public void addFood() {
        Scanner sc = new Scanner(System.in);
        Food food = new Food();
        System.out.println("Nhập vào mã món ăn:");
        food.setFoodId(sc.nextLine());
        System.out.println("Nhập vào tên món ăn:");
        food.setFoodName(sc.nextLine());
        System.out.println("Nhập vào mô tả món ăn:");
        food.setDescription(sc.nextLine());
        System.out.println("Nhập vào giá món ăn:");
        food.setPrice(sc.nextDouble());
        sc.nextLine();
        categoryMenu.MenuCreator(food);
        foodArrayList.add(food);
    }

    public void printList() {
        System.out.printf("%-10s|%-10s|%-10s|%-15s|%-10s|%-10s\n",
                "FoodID", "FoodName", "Category", "Description", "Price", "Create At");
        for (Food food : foodArrayList) {
            System.out.println(food.toString());
        }
    }

}
