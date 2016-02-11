/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youngmin
 */

import javax.swing.JApplet;
//@Author Youngmin
public class Main extends JApplet
{
   public void init()
   {
      setSize(500,200); // set size 
   //   getContentPane().add(new sortGraph());
      getContentPane().add(new Driver());
   }
}

