package com.greatlearning.transaction;

public class TransactionDetails 
{
	private  int[] transactionArray;
	private int size ;
	private int currentTransactionCount ;
	public TransactionDetails(int size )
	{
		this.size = size ;
		transactionArray = new int[size];
		currentTransactionCount = 0 ;				
	}
	
	public void InsertTransaction(int transaction)
	{
		if(currentTransactionCount >= size)
			System.out.println("The transaction Array is full ");
		else
			transactionArray[currentTransactionCount++] = transaction ;
	}
	
	public int getTransactionAtIndex(int i )
	{
		if(i >= size )
		{
			System.out.println("Array is out of Bounds");
			return -1 ;
		}
		else return transactionArray[i];
						
	}
	
	public int getTotalNumberOfTransaction()
	{
		return size ;
	}
	
	public int getCurrentTransactionCount()
	{
		return currentTransactionCount ;
		
	}

}
