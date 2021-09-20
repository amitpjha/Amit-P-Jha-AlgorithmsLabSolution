package com.greatlearning.transactionservice;

public class Main {

	public static void main(String[] args) 
	{
		TransactionOperations tranOps = new TransactionOperations();
		tranOps.getTransactionArraySizeAndPopulateTransaction();
		tranOps.targetAchievedCalculation();
	}
}
