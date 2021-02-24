package second_part;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        HashMapOpen<Integer, Integer> hashMapOpen = new HashMapOpen<>();
        hashMapOpen.add(1,1);
        hashMapOpen.add(14,14);
        hashMapOpen.add(17,17);
        hashMapOpen.add(18,18);
        System.out.println(hashMapOpen.getBucketArray().get(1).value);

//            Map<String, Integer>map = new Map<>();
//            map.add("this",1 );
//            map.add("coder",2 );
//            map.add("this",4 );
//            map.add("hi",5 );
//            System.out.println(map.size());
//            System.out.println(map.remove("this"));
//            System.out.println(map.remove("this"));
//            System.out.println(map.size());
//            System.out.println(map.isEmpty());
        }
    }

