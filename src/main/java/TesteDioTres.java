import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteDioTres {
    public static void main(String[] args) throws IOException {
        int positivos = 0;
        int negativos = 0;
        int pares = 0;
        int impares = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ( ((line = br.readLine()) != null) && (!line.isEmpty())) {
            String[] tokens = line.split("\\s");
            double valor = Double.parseDouble((line));
            if (valor > 0)
                positivos++;
            else if(valor < 0)
                negativos++;
            if(valor % 2 == 0)
                pares++;
            else
                impares++;
        }
        br.close();
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impares");
        System.out.println(positivos + " valor(es) positivos");
        System.out.println(negativos + " valor(es) negativos");
        //7 -5 6 -3.4 4.6 12
    }
}
