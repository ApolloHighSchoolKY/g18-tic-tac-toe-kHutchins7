//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));
        
        //read how meny times you should read
        TicTacToe Noo = new TicTacToe("XXXOOXXOO");
        System.out.println(Noo.getWinner());
		System.out.println(Noo.toString());

		TicTacToe Nooo = new TicTacToe("OXOOXOXOX");
        System.out.println(Nooo.getWinner());
		System.out.println(Nooo.toString());

		TicTacToe Noooo = new TicTacToe("OXOXXOXOO");
        System.out.println(Noooo.getWinner());
		System.out.println(Noooo.toString());

		TicTacToe Nooooo = new TicTacToe("OXXOXOXOO");
        System.out.println(Nooooo.getWinner());
		System.out.println(Nooooo.toString());

		TicTacToe Noooooo = new TicTacToe("XOXOOOXXO");
        System.out.println(Noooooo.getWinner());
		System.out.println(Noooooo.toString());
		//TicTacToe only wants this: file.nextLine()
		
		//Make tix tac tie object

		//print the game

		//print the winner
		
	}
}



