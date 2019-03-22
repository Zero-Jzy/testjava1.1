package main;

import entity.Game;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game game = new Game();
        System.out.println("Nhập vào tên:");
        game.setName(sc.nextLine());
        System.out.println("Nhập vào mô tả:");
        game.setDescription(sc.nextLine());
        System.out.println("Nhập vào giá:");
        game.setPrice(sc.nextDouble());
        sc.nextLine();
        System.out.println("Nhập vào ngày phát hành:");
        game.setReleaseDate(sc.nextLine());
        System.out.println("Nhập vào trang chủ:");
        game.setWebsite(sc.nextLine());
        System.out.println(game.toString());

    }
}
