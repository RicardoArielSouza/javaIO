package teste;

import java.io.*;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        //Fluxo de escrita para arquivo

//        FileWriter fw = new FileWriter("lorem3.txt");
//        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//        fw.write(System.lineSeparator());
//        fw.write(System.lineSeparator());
//        fw.write("auhifghsdfgkljdhfsjhgdfjshgd fhjkdgsjkl hjfgdjksgfhkjs");

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("auhifghsdfgkljdhfsjhgdfjshgd fhjkdgsjkl hjfgdjksgfhkjs");

        bw.close();

    }
}