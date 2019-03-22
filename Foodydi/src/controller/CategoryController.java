package controller;
import entity.Category;
import java.util.ArrayList;

public class CategoryController {

    public ArrayList<Category> getList(){
        var categoryArrayList = new ArrayList<Category>();
        categoryArrayList.add(new Category("CT01", "Đồ ăn"));
        categoryArrayList.add(new Category("CT02", "Đồ uống"));
        categoryArrayList.add(new Category("CT03", "Đồ ..."));
        return categoryArrayList;
    }


}
