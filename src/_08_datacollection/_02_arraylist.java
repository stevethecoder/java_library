package _08_datacollection;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		
		names.add("James");
		names.add("Paul");
		names.addAll(Arrays.asList("Sydney", "Travis", "Justin"));
		System.out.println(names);
		
		ArrayList<Integer> agesOfThem = new ArrayList<Integer>();
		
		agesOfThem.addAll(Arrays.asList(36,38,25,27,18));
		System.out.println(agesOfThem);
		
		
		ArrayList<Double> dubNums = new ArrayList<Double>();
		dubNums.addAll(Arrays.asList(36.3,38.2,25.7,27.9,18.0));
		
		System.out.println(dubNums);
		System.out.println(dubNums.get (1));
	}

}

