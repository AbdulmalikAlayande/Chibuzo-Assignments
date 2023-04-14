package Chibuzo_Algorithm_Questions;

import java.util.ArrayList;
import java.util.List;

public class PrintVentures{
	
	public List<Integer> doSomething(int[] theList){
		List<Integer> newList = new ArrayList<>();
		int i = 0;
		while (i != theList.length) {
			int multiple = 1;
			int counter = 0;
			for (int j : theList) multiple *= j;
			multiple /= theList[counter];
			counter++;
			newList.add(multiple);
			i++;
		}
		return newList;
	}
	
	public static void main(String[] args) {
		PrintVentures printVentures = new PrintVentures();
		int[] List = {2, 4, 5, 6, 7};
		System.out.println(printVentures.doSomething(List));
	}
}