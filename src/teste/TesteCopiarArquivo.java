package teste;

import java.io.*;
import java.net.Socket;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

//        Socket s = new Socket(); // para receber e enviar pela rede

        //Fluxo de entrada com arquivo

//        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStream fis = System.in;
//        InputStream fis = s.getInputStream(); //entrada pela rede
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        //Fluxo de escrita para arquivo

        OutputStream fos = new FileOutputStream("lorem2.txt");
//        OutputStream fos = s.getOutputStream(); //saida para rede
//        OutputStream fos = System.out;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null && !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}