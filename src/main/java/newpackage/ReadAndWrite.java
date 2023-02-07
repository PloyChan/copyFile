
package newpackage;
import java.io.*;

public class ReadAndWrite {

    public static void main(String[] args) throws Exception{
        
        try(OutputStream file = new FileOutputStream("./test.txt");
                OutputStreamWriter w = new OutputStreamWriter(file,"UTF-8")
                ){
            w.write("Hello");
        }
        
        try(InputStream file = new FileInputStream("./test.txt");
                InputStreamReader r = new InputStreamReader(file,"UTF-8")){
            while(true){
                int b = r.read();
                if(b == -1){
                    break;
                }
                System.out.print((char)b);
            } System.out.println(); 
        }
    }
}
