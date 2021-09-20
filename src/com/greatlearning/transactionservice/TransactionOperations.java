package com.greatlearning.transactionservice;
import com.greatlearning.transaction.TransactionDetails;
import  java.util.Scanner ;

public class TransactionOperations 
{
	TransactionDetails tran ;
	public void getTransactionArraySizeAndPopulateTransaction( )
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = scan.nextInt();
		tran = new TransactionDetails(size);		
		System.out.println("Enter the values of array");
		for(int i = 0 ; i < size ; i++  )
		{
			tran.InsertTransaction(scan.nextInt());
		}
	//	scan.close();
		
	}
	
	public void targetAchievedCalculation()
	{
		System.out.println("Enter the total no of targets that needs to be achieved");	
		Scanner scan = new Scanner(System.in);

		int targetNumber = scan.nextInt();
		
		for (int i = 0 ; i < targetNumber ; i++)
		{
			System.out.println("Enter the value of target");
			long target = scan.nextLong();
			TargetAchieved(target );
		}	
//		scan.close();
		
	}
	
	public void TargetAchieved( long target)
	{
		long sum = 0 ;
		boolean targetMet = false ;
		int i ;
		for( i = 0 ; i < tran.getTotalNumberOfTransaction() ; i++)
		{
			sum = sum + tran.getTransactionAtIndex(i);
			if(sum >= target)
			{
				targetMet = true ; 
				break ;
			}
			
		}
		
		if(targetMet == true)
		{
			System.out.println("Target achieved after "+(i + 1)+ " transactions");
		}
		else 
		{
			System.out.println("Given target is not achieved");
		}
	}
	
}
