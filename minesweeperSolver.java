import javax.swing.*;
import java.lang.*;
class minesweeperSolver {
    public static void main(String[] args) { 
    
//input for the places that each square is.
 
   String[] firstRow = {"0","0","0","0","0","0","0","0"};
   int fo0;
   String fos0;
 String[] options = new String[] {"1", "2", "3", "4","5","6","7","8","0"};
   //first option
   for(int i=0; i<8; i++){
   fo0 = JOptionPane.showOptionDialog(null, "First row", "What is the first squares number? If no number(not know) please enter 0", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
        null, options, options[0]);
        
   fos0 = Integer.toString(fo0);
        
   firstRow[i] = fos0;   
      }
      JOptionPane.showMessageDialog(null,firstRow);
    }
   }