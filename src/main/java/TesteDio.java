import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TesteDio {
    public static void main(String[] args) throws IOException {
        int total = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ( ((line = br.readLine()) != null) && (!line.isEmpty())) {
            String[] tokens = line.split("\\s");
            System.out.println(line);
            if (Double.parseDouble((line)) > 0)
                total++;
        }
        br.close();
        System.out.println(total + " valores positivos ");
//        7
//        -5
//        6
//        -3.4
//        4.6
//        12
    }
}
