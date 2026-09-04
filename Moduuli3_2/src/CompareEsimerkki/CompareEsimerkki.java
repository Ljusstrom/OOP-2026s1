package CompareEsimerkki;

import java.util.ArrayList;
import java.util.Comparator;

public class CompareEsimerkki {
    public static void main(String[] args) {

        Comparator<String> nameComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        };

        ArrayList<String> ar = new ArrayList<>();
        ar.add("Matti");
        ar.add("Olga");
        ar.add("Ahmed");
        ar.sort(nameComparator);

        //System.out.println(ar);
        for (String s : ar) {
            System.out.println("Nimi: " + s);
        }
    }
}
