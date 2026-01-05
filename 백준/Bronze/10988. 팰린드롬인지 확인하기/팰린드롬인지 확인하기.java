import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringBuilder sbReverse = new StringBuilder();


        String s = br.readLine();
        sb.append(s);
        sbReverse.append(s).reverse();

        if (sb.toString().contentEquals(sbReverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        } 
            
            


    }
}

