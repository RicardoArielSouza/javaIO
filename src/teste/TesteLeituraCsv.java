package teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCsv {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8);
        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format(new Locale("pt","BR"),
                    "%s - %04d-%06d, %20s: %08.2f",
                    tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();

//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));
        }

        scanner.close();

    }
}