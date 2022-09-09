package com.bridgelabz;

import java.util.Random;

public class SnakeLadder 
{

	public static void main(String[] args) 
	{
		int p =0;
		System.out.println("Starting position is" +p);

		// getting die number
		Random random=new Random();
		int rolldice=random.nextInt(6)+1;
		System.out.println("roll die : "+rolldice);

		//check for the option
		int option=random.nextInt(3);
		switch (option) 
		{
		case 0:
			System.out.println("No Play");
			break;

		case 1:
			System.out.println("Got ladder");
			if(p+rolldice <=100) {
				p = p+rolldice;
			}
			break;

		case 2:
			System.out.println("Got snake");
			if(p!=0 && p-rolldice>=0 ) 
			{
				p = p-rolldice;
			}
			else {
				p=0;
			}
			break;

		default :
			System.out.println("Incorrect  option");
			break;
		}

		System.out.println("current position is "+p);
	}



}


