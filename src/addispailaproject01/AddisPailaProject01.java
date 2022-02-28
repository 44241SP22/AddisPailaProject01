/**
* Class: 44-241-01 Computer Programming II
* Author: Spencer Addis and Saiteja Paila
* Description: (Give a brief description for the exercise or project)
* Due: March 3, 2022
* I pledge that I have completed the programming assignment independently.
* I have not copied the code from a student or any source.
* I have not given my code to any other student and will not share this code with anyone under any circumstances.
*/
package addispailaproject01;
import java.util.*;
import java.io.*;
import javax.swing.*;
public class AddisPailaProject01 {
    public static void main(String[] args) throws FileNotFoundException {
        
        JFileChooser myChooser = new JFileChooser();
        myChooser.showOpenDialog(null);
        File file = myChooser.getSelectedFile();
        Scanner input = new Scanner(file);
        
        String[] minStockInfo = new String[8];
        String[] maxStockInfo = new String[8];
        
        String line = input.nextLine();
        String[] info = line.split(",");
        String max = info[6];
        
        
        while(input.hasNextLine()) {
            line = input.nextLine();
            info = line.split(",");
            if (info[6] > max) {
                
            }
        }
        
    }
    //Method to print min data to screen
    public static void printMintoScreen(String[] minParts, long count) {
        
    }
    
}
