package dyanamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Products<T extends Category>{
    private List<T> list = new ArrayList<>();

    public Products() {
        this.list = new ArrayList<>();
    }

    public void addItems(T item){
        list.add(item);
        System.out.println(item.categoryName + " added to category");
    }

    public List<T> getList(){
        return list;
    }
}
