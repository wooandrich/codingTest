import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> arr = new ArrayList<>();

        in.nextLine();

        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
            if (arr.contains(str)) {
                continue;
            } else {
                arr.add(str);
            }
        }


        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (String s : arr) {
            System.out.println(s);
        }





    }
}