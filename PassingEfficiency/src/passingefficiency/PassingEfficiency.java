/*
 *Author: Alex Pratt
 * Name: Excel Table
 * Description: Main Class
 * Last Edit: 12/12/17
 */
package passingefficiency;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author aprat
 */
public class PassingEfficiency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ExcelTable et = new ExcelTable();
        List<List<String>> games = et.Excel();
        
        String opponent = JOptionPane.showInputDialog("Please Enter the Opponent of the Game you wish to see.");
        
        for (int i = 0; i <= games.size(); i++)
            if (games.get(i).get(0) == opponent)
            {
                System.out.println(games.get(i).get(0));
            } else 
            {
                JOptionPane.showMessageDialog(null,"No Game Found");
                
            }
        
    }
    
}
