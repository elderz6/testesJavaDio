import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteDioNotas {
    public static void main(String[] args) throws IOException {
        int n = 0;
        int notas = 0;
        int[] valores = new int[]{100, 50, 20, 10, 5, 2, 1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        System.out.println(n);
        for (int i = 0; i < valores.length; i++){
            notas = subtract(n, valores[i]);
            n = n - subtract(n, valores[i])*valores[i];
            System.out.println(notas + " nota(s) de R$ " + valores[i] +",00");
        }
    }
    public static int subtract(int number, int nota){
        int result = 0;
        if (number >= nota){
            result = number/nota;
        }
        return result;
    }
}
