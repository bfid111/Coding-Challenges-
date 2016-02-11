/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youngmin
 */
/*
 * 
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
// @Author Youngmin
/*
 * Visually Simulates insertion sort and selection sort with a graph 
 */
public class Driver extends JPanel
{
   private Timer movementSet;
   private Driver sort;
   static int delay = 100; // 250ms of delay for displaying bars 
   static int size = 30; // size of array          
   static int max = 100;
   int index = 0;
   int[] numbers = new int[size];
   int[] numbers1 = new int[size];
   int parameter = 0;
   int status = 0;
   int index1 =0;
   public Driver () {
      for (int i=0; i< size; i++)
      numbers[i] = (int) (Math.random() * max) + 1; // create random number
          for (int i=0; i< size; i++)
      numbers1[i] = (int) (Math.random() * max) + 1; // create random number
      movementSet = new Timer(delay, null); // new timer with 250ms delay 
      movementSet.addActionListener(new Listener()); // refesh applet to display sorts 
      movementSet.start();// starts ActionListener 
      setBackground(Color.black);
 }
   @Override
   public void paintComponent(Graphics page){
      super.paintComponent(page);
      paint(page, 500, 200);
      paint(page, 500, 200);
 
   }
   public class Listener implements ActionListener{
      @Override
      public void actionPerformed (ActionEvent event) {
         if (parameter != index - numbers.length){
            selectionSort();
            repaint(); // refresh applet  
         }
         if(status == 1){
               
               InsertionSort();
               repaint();
         }
      }
   }

   public void paint(Graphics page, int width, int height){
       int a = 10;
       String name = "SELECTION SORT";
       String name1 = "INSERTION SORT";
       if(status == 0) {
      for (int i=0; i<numbers.length; i++){
         page.setColor(Color.white); // set color 
        //page.drawRect((i+1)*a, 100, (i+1)*a ,numbers[i]); 
        page.drawLine((i+5)*a, 100, (i+5)*a, numbers[i]); // print bars
        page.drawString(name, 150, 150);
      }
       }
      if(status == 1){
             for (int i=0; i<numbers1.length; i++){
          page.setColor(Color.white); // set color 
        //page.drawRect((i+1)*a, 100, (i+1)*a ,numbers[i]); 
          page.drawLine((i+5)*a, 100, (i+5)*a, numbers1[i]); // print bars
          page.drawString("---------------------------------", 150, 150);
          page.drawString(name1, 180, 180);
             }
      }
      }  
     public void selectionSort () {
   // use this for selectionsort
      int min, temp;
      if (index < numbers.length-1){
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++)
            if (numbers[scan] > numbers[min])
               min = scan;
         // Swap the values
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
         index++;
      }
      if(index > 28) {
          status=1;
          index = 0;
      }
   }
      public void InsertionSort () { // use this for insertionsort
      int key = numbers1[index1];
      int position = index1;
      // shift larger values to the right
      while (position > 0 && numbers1[position-1] < key) {
         numbers1[position] = numbers1[position-1];
         position--;
      }
      numbers1[position] = key;
      index1++;
   }
}
