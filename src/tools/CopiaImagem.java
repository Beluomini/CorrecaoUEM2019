package tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author radames
 */
public class CopiaImagem {

    public static void copiar(String origem, String destino) {
        //  System.out.println("Origem >"+origem+ " Destino >"+destino);
        try {
            InputStream in;
            in = new FileInputStream(origem);
            OutputStream out;
            byte[] buf = new byte[1024];
            out = new FileOutputStream(destino);
            int len;
            try {
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
            } catch (IOException ex) {
                System.out.println("Erro na cópia");
            }
            try {
                in.close();
                out.close();
            } catch (IOException ex) {
                System.out.println("Erro na cópia");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro na cópia - arquivo não encontrado");
        }
    }
}
