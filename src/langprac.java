import java.util.*;

public class langprac {
    public static void main(String[] args) {

        String str = "881120-1068234";
        String yyyyMMDD = str.substring(0, 6);
        String rest = str.substring(7);
        System.out.println(yyyyMMDD);
        System.out.println(rest);

        String a = "a:b:c:d";
        String b = a.replaceAll(":", "#");
        System.out.println(b);

        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(1,3,5,2,4));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);


        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(myList2); // [Life, is, too, short] 출력
        System.out.println(myList2.get(0) + " " + myList2.get(1) +  " " + myList2.get(2) +  " " + myList2.get(3));

        String result = String.join(" ", myList2);
        System.out.println(result); // [Life, is, too, short] 출력

        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        Integer ext = grade.remove("B");
        System.out.println(ext);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        HashSet<Integer> num2 = new HashSet<>(numbers);
        ArrayList<Integer> num3 = new ArrayList<>(num2);
        System.out.println(num3);

        printCoffeePrice(Coffee.AMERICANO);  // "가격은 3000원 입니다." 출력

        String sss = "abdefg";
        boolean bbb = sss.contains("a");
        System.out.println(bbb);

    }


    static void printCoffeePrice(Coffee type) {
        HashMap<Coffee, Integer> priceMap = new HashMap<>();
        priceMap.put(Coffee.AMERICANO, 3000);  // 1: 아메리카노
        priceMap.put(Coffee.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
        priceMap.put(Coffee.CAFE_LATTE, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    enum Coffee {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }
}
