import java.io.*;
import java.util.Scanner;

/**
 * Created by tom on 2016/11/16.
 */
class MyThread extends Thread {

    public void run(){
        try{
            File fileTest = new File("G:\\Test" + File.separator+"Test.txt");
            FileInputStream input = new FileInputStream(fileTest);
            InputStreamReader a = new InputStreamReader(input);
            BufferedReader b = new BufferedReader(a);
            String line = b.readLine();
            int count =0 ;
            System.out.println("内容为");
            while(line != null){
                System.out.println(line);
                count++;
                line = b.readLine();
            }
            System.out.println(count);
            System.out.println("Enter The key Word");
            Scanner Enter = new Scanner(System.in);
            String content = Enter.next();
            File FileTest = new File("G:\\Test" + File.separator+"Test.txt");
            FileInputStream Input = new FileInputStream(FileTest);
            InputStreamReader A = new InputStreamReader(Input);
            BufferedReader B = new BufferedReader(A);
            String Line = B.readLine();
            int location = 1;
            try {
                while (Line != null) {
                    location++;
                    Line = B.readLine();
                    try {
                        if (Line.contains(content)) {
                            System.out.println(content + "所在的行的内容为:" + Line + ",所在的行数为" + location);
                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            b.close();
            input.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class TextEditor{
    public static void main(String[] args) throws Exception{
        MyThread Read = new MyThread();
        Read.run();
    }
}