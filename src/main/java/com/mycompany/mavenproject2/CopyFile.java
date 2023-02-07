
package com.mycompany.mavenproject2;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception{

        //java CopyFile SourceFile DestinationFle
        try(InputStream in = new FileInputStream("/home/ploy/Downloads/myProject/Student/src/student/Main.java");
                OutputStream file = new FileOutputStream("./Main2.java")){
            
            while(true){
                int b = in.read();
                if(b == -1){
                    break;
                } 
                file.write((char)b);
            }
        }  
    }
}
