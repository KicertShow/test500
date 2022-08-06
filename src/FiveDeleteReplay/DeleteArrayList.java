package FiveDeleteReplay;

import java.util.ArrayList;

public class DeleteArrayList {
    public static void main(String[] args) {
//        int[] str = {5, 6, 6, 6, 8, 8, 7, 4};
//        List<Integer> list = new ArrayList<Integer>();
//        for (int i = 0; i < str.length; i++) {
//            if (!list.contains(str[i])) {
//                list.add(str[i]);
//            }
//        }
//        System.out.println("去除重複後的list集合" + list);
        int[] str = {1, 1, 1, 2, 2, 2, 5, 5, 5, 5};
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (!list.contains(str[i])) {
                list.add(str[i]);
            }
        }
        System.out.println("這邊是去除陣列重複" + list);


    }

}
