package ex.item;

import java.util.HashMap;
import java.util.Map;

public class ItemSearch {
    public static void main(String[] args) {
        Map<Integer,Item> map = new HashMap<>();

        map.put(1,new Item(1,"消しゴム",100));
        map.put(2,new Item(2,"ボールペン",120));
        map.put(3,new Item(3,"コンパス",400));
        map.put(4,new Item(4,"定規",200));
        map.put(5,new Item(5,"ノート",140));
        map.put(6,new Item(6,"付箋",480));
        map.put(7,new Item(7,"えんぴつ",500));

        //一覧表示
        for (Item item: map.values()){
            System.out.println(item);
        }

        //検索処理
        int searchNo = 1;
        if (map.containsKey(searchNo)){
            System.out.println(String.format("\n商品ID%dによる検索",searchNo));
            System.out.println(map.get(searchNo));
        } else {
            System.out.println(String.format("商品ID%dによる検索",searchNo));
            System.out.println("該当商品はありません");
        }
    }

}
