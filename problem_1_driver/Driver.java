package problem_1_driver;

import java.util.Scanner;

import problem_1_service.Balance_Bracket;

public class Driver{
	//Driver code
	public static void main(String[] args) {

		//import scanner class to take user input brackets
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter brackets");
		String str=sc.nextLine();

		//Create instance of Balance_Bracket
		Balance_Bracket balance =new Balance_Bracket();

		if(balance.BracketsBalanced(str)) {
			System.out.println("Brackets are Balanced");
		}
		else {
			System.out.println("Brackets are not Balanced");
		}
		sc.close();
	}
}
