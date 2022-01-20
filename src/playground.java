import java.util.*;

class playground {
    public static void main(String[ ] args) {

        ArrayList<Integer> list = new ArrayList<>(60);

        for (int i=0; i<6; i++) {
            int temp = (int) (Math.random()*45 +1);
            list.add(temp);
        }

        Collections.sort(list);

        System.out.println(list);


    }
}