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

public class Kata4v3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String from = "C:\\Users\\usuario\\Desktop\\nuevo.txt";
        String to = "C:\\Users\\usuario\\Desktop\\nuevo1.txt";
        InputStream input = new BufferedInputStream(new FileInputStream(from));
        OutputStream output = new BufferedOutputStream(new FileOutputStream(to));
        
        while(true){
            int read = input.read();
            if(read < 0)break;
            output.write(read);
        }
        input.close();
        output.flush();
        output.close();
    }
}
