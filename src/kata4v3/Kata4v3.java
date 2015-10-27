package kata4v3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

public class Kata4v3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String from = "C:\\Users\\usuario\\Desktop\\T2 Abstraccion y polimorfismo.pdf";
        String to = "C:\\Users\\usuario\\Desktop\\T2 Abstraccion y polimorfismo2.pdf";
        Date date = new Date();
        float first= date.getTime();
        byte[] buffer = new byte[1024];
        InputStream input = new BufferedInputStream(new FileInputStream(from));
        OutputStream output = new BufferedOutputStream(new FileOutputStream(to));
        
        while(true){
            int read = input.read(buffer);
            if(read < 0)break;
            output.write(buffer);
        }
        Date date2 = new Date();
        float second= date2.getTime();
        System.out.println(second-first);
        input.close();
        output.flush();
        output.close();
    }
}
