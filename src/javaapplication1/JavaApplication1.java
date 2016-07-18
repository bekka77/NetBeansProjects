/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Rebecca
 */
import java.util.*;
import java.util.ArrayList;

class randomTest
{
  public static void main(String args[])
  {
      	ArrayList<String> rockPaperScissor = new ArrayList<>();
		rockPaperScissor.add("rock");
		rockPaperScissor.add("paper");
		rockPaperScissor.add("scissor");
		//weeklyTemperatures.add("test4");
		//weeklyTemperatures.add(2, "111");
      

    int length = rockPaperScissor.size();
    
    Random random = new Random();
    for (int i = 0; i < length; i++)
		{
    //        int rand = (int) (Math.random() * length);

            System.out.print(rockPaperScissor.get(random.nextInt(rockPaperScissor.size())));

            System.out.print(" ");
  }
}
}