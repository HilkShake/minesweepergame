import javax.swing.*;
import java.lang.*;
class minesweeperSolver {//start one
    public static void main(String[] args) {//start two
    
//input for the places that each square is.
 
   String[] zeroRow = {"0","0","0","0","0","0","0","0"};
   String[] firstRow = {"0","0","0","0","0","0","0","0"};
   String[] secondRow = {"0","0","0","0","0","0","0","0"};
   String[] thirdRow = {"0","0","0","0","0","0","0","0"};
   String[] forthRow = {"0","0","0","0","0","0","0","0"};
   String[] fifthRow = {"0","0","0","0","0","0","0","0"};
   String[] sixthRow = {"0","0","0","0","0","0","0","0"};
   String[] seventhRow = {"0","0","0","0","0","0","0","0"};
   int fo;
   String fos;
 String[] options = new String[] {"0","1", "2", "3", "4","5","6","7","8"};
   for(int x=0; x<8; x++){//start three
      for(int i=0; i<8; i++){//start four          
         if(x==0){
         fo = JOptionPane.showOptionDialog(null, "What is the first squares number? If no number(not know) please enter 0", "What is the first squares number? If no number(not know) please enter 0", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
         fos = Integer.toString(fo);
           zeroRow[i] = fos;   
          }
         if(x==1){
         for
         fo = JOptionPane.showOptionDialog(null, "What is the second rows numbers? If no number(not know) please enter 0", "What is the first squares number? If no number(not know) please enter 0", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
         fos = Integer.toString(fo);
            firstRow[i] = fos;   
          }
         if(x==2){
         fo = JOptionPane.showOptionDialog(null, "What is the third squares number? If no number(not know) please enter 0", "What is the first squares number? If no number(not know) please enter 0", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
         fos = Integer.toString(fo);
            secondRow[i] = fos;   
          }
         if(x==3){
         fo = JOptionPane.showOptionDialog(null, "What is the forth squares number? If no number(not know) please enter 0", "What is the first squares number? If no number(not know) please enter 0", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
         fos = Integer.toString(fo);
            thirdRow[i] = fos;   
          }
          if(x==4){
          fo = JOptionPane.showOptionDialog(null, "What is the fifth squares number? If no number(not know) please enter 0", "What is the first squares number? If no number(not know) please enter 0", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
         fos = Integer.toString(fo);
            forthRow[i] = fos;   
          }
          if(x==5){
          fo = JOptionPane.showOptionDialog(null, "What is the sixth squares number? If no number(not know) please enter 0", "What is the first squares number? If no number(not know) please enter 0", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
         fos = Integer.toString(fo);
            fifthRow[i] = fos;   
          }
          if(x==6){
          fo = JOptionPane.showOptionDialog(null, "What is the seventh squares number? If no number(not know) please enter 0", "What is the first squares number? If no number(not know) please enter 0", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
         fos = Integer.toString(fo);
            sixthRow[i] = fos;   
          }
          if(x==7){
          fo = JOptionPane.showOptionDialog(null, "What is the eighth squares number? If no number(not know) please enter 0", "What is the first squares number? If no number(not know) please enter 0", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
         fos = Integer.toString(fo);
            seventhRow[i] = fos;   
          }
       }//end four
   }//end three
  JOptionPane.showMessageDialog(null,zeroRow);
  JOptionPane.showMessageDialog(null,firstRow);
  JOptionPane.showMessageDialog(null,secondRow);
  JOptionPane.showMessageDialog(null,thirdRow);
  JOptionPane.showMessageDialog(null,forthRow);
  JOptionPane.showMessageDialog(null,fifthRow);
  JOptionPane.showMessageDialog(null,sixthRow);
  JOptionPane.showMessageDialog(null,seventhRow);
 }//end two
}//end one