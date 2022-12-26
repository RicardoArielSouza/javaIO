package teste;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de escrita para arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
//        PrintStream ps = new PrintStream("lorem5.txt");
        PrintWriter ps = new PrintWriter("lorem6.txt", StandardCharsets.UTF_8);

        ps.println("Lorem ipsum ÇÇ â 1º dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("auhifghsdfgkljdhfsjhgdfjshgd fhjkdgsjkl hjfgdjksgfhkjs");

        ps.close();

    }
}
