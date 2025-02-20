//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
      mat = new char[3][3];
	  

	}

	public TicTacToe(String game)
	{
		char[][]fat = new char[3][3];
		int count = 0;
      //row major order will happen here
	  for(int row = 0; row<fat.length;row++)
	  {
		for(int col = 0;col < fat[row].length;col++)
		{
			fat[row][col]= (game.charAt(count));
			count ++;
			
		}
	  }
	  mat = fat;

	}

	public String getWinner()
	{
		char[][] cat1 = new char[3][3];
		cat1 = mat;
		String result = " ";

		if(cat1[0][0]== cat1[0][1] && cat1 [0][1] == cat1[0][2] )
		   result="" + cat1[0][0]+ " is the winner horizontally";
		else if(cat1[1][0]== cat1[1][1] && cat1 [1][1] == cat1[1][2] )
		   result="" + cat1[1][0]+ " is the winner horizontally";
		else if(cat1[2][0]== cat1[2][1] && cat1 [2][1] == cat1[2][2] )
		   result="" + cat1[2][0]+ " is the winner horizontally";
		else if(cat1[0][0]== cat1[1][0] && cat1 [1][0] == cat1[2][0] )
		   result="" + cat1[0][0]+ " is the winner vertically";
		else if(cat1[0][1]== cat1[1][1] && cat1 [1][1] == cat1[2][1] )
		   result="" + cat1[1][1]+ " is the winner vertically";
		else if(cat1[0][2]== cat1[1][2] && cat1 [1][2] == cat1[2][2] )
		   result="" + cat1[0][2]+ " is the winner vertically";
		else if(cat1[0][0]== cat1[1][1] && cat1 [1][1] == cat1[2][2] )
		   result="" + cat1[1][1]+ " is the winner diagnoly";
		else if(cat1[2][0]== cat1[1][1] && cat1 [1][1] == cat1[0][2] )
		   result="" + cat1[2][0]+ " is the winner diagnoly";
		else
		result="The game is a tie";
		return "" + result;
	}

	public String toString()
	{
		String output="";
		for(int row = 0; row<mat.length;row++)
		{
			System.out.println(Arrays.toString(mat[row]));
		}

		return output+"\n\n";
	}
}