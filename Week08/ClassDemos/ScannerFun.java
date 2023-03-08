import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFun {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner keyboard, fileScan, urlScan;
        File file;
        String fileName, url;

        keyboard = new Scanner(System.in);
        System.out.println("What is the filename?");
        fileName = keyboard.nextLine();
        keyboard.close();

        file = new File(fileName);
        fileScan = new Scanner(file);//File Scanner
        while (fileScan.hasNext()) {
           url = fileScan.nextLine();
           System.out.println("URL " + url);
           urlScan = new Scanner(url);//String Scanner
           urlScan.useDelimiter("/");

           while (urlScan.hasNext()){
            System.out.println("\t" + urlScan.next());
           }
           System.out.println();

        }
        

        fileScan.close();
        
    }
}
