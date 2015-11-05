package org.dimigo.oop;

public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount){
		PiggyBank.balance += amount;
		System.out.println(member.getMemberName()+" "+amount+"원 넣음");
	}
	
	public static void stealMoney(FamilyMember member, int amount){
		PiggyBank.balance -= amount;
		System.out.println(member.getMemberName() + " " + amount + "원 훔쳐감");
	}
	
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액 : " + PiggyBank.balance + "원");
	}
}
