package main;

import controller.CategoryController;
import entity.Food;

import java.util.Scanner;

public class CategoryMenu {
    public void MenuCreator(Food food) {
        CategoryController categoryController = new CategoryController();
        var listCategory = categoryController.getList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int lengthList = listCategory.size();
            System.out.println("Vui lòng chọn loại món ăn");
            for (int i = 0; i < lengthList; i++) {
                System.out.println((i + 1) + ". " + listCategory.get(i).getName());
            }
            int ch = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < lengthList; i++) {
                if (ch == i + 1) {
                    food.setCategory(listCategory.get(i));
                    return;
                }
            }
            System.out.println("Vui lòng chọn lại");
        }
    }

}
