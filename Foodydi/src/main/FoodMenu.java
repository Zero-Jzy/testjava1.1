package main;

import controller.FoodController;

import java.util.Scanner;

public class FoodMenu {
    public void MenuCreator() {
        Scanner sc = new Scanner(System.in);
        FoodController controller = new FoodController();
        while (true) {
            System.out.println("————————Foodydi———————");
            System.out.println("1. Thêm món ăn.");
            System.out.println("2. Hiển thị danh sách món ăn.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("——————————————————————");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    controller.addFood();
                    break;
                case 2:
                    controller.printList();
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại lựa chọn từ 1 đến 3!");
                    break;
            }

        }
    }
}
