package demo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Boxer> boxerList = List.of(new Boxer("幕之内一歩", 25, "鴨川ボクシングジム"),
                new Boxer("宮田一郎", 25, "河原ボクシングジム"),
                new Boxer("千堂武士", 26, "なにわ拳闘会"),
                new Boxer("鷹村守", 29, "鴨川ボクシングジム"));
        for (Boxer boxer : boxerList) {
            if (boxer.getGimName().equals("鴨川ボクシングジム")) {
                System.out.println("名前" + boxer.getName());
                System.out.println("年齢" + boxer.getAge());
                System.out.println("ボクシングジム" + boxer.getGimName());
            }
        }
    }
}
