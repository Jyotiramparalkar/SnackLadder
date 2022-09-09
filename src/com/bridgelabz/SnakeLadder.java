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

	}

}
