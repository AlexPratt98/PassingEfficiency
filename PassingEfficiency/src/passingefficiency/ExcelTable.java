/*
 * Author: Alex Pratt
 * Name: Excel Table
 * Description: Excel Class for PassingEfficiency
 * Last Edit: 12/12/17
 */
package passingefficiency;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author aprat
 */
public class ExcelTable {
    
    public List<List<String>> Excel () {
String fileName= "C:\\Users\\aprat\\OneDrive\\Documents\\ProjectStats.csv";
        File file= new File(fileName);

        // this gives you a 2-dimensional array of strings
        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner(file);

            while(inputStream.hasNext()){

                String line = inputStream.nextLine();
                String [] stats = line.split(",");
                
                lines.add(Arrays.asList(stats));
            }

            inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    return lines;    
        
}

    
}