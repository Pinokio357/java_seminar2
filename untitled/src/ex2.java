import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws FileNotFoundException{
        String path = "src/new.txt";

        File file = new File(path);
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            String[] my_array =  scan.nextLine().split(":|,");

            System.out.println("Студент " + my_array[1].substring(1, my_array[1].length() - 1) + " получил " + my_array[3].substring(1, my_array[3].length() - 1) + " по предмету " + my_array[5].substring(1, my_array[5].length() - 1) + ".");


        }


    }
}
