import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteDioDois {
    public static void main(String[] args) throws IOException {
        int total = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        br.close();
        for(int i = 1; i<= line; i++){
        if(i%2 == 0)
            System.out.println(i);
        }
    }
}
