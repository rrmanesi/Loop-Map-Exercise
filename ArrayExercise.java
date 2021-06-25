import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayExercise {
	public static void main(String[] args){
		
	 ArrayList<Integer> inputList = new ArrayList<Integer>(5);
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter 5 numbers with space: ");
	 String[] numbers = null;
	 if (scan.hasNextLine()){
		 numbers = scan.nextLine().split(" ");
	 }
	 if (numbers != null){
		 for (String eachNum : numbers){
			 try{
				 inputList.add(Integer.parseInt(eachNum.trim()));
			 }catch (Exception e){
				 System.out.println("Please input numbers: ");
			 }
		 }
		 int sum = 0;
		 int product = 1;
		 for(int i:inputList){
			  sum += i;
		 }
		 for(int i:inputList){
			  product *= i;
		 }
		 System.out.println(sum);
		 System.out.println(product);
		 System.out.println(Collections.min(inputList));
		 System.out.println(Collections.max(inputList));
	 }
	 
	 
	 
	}
}
