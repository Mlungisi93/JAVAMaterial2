package passArray;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindProvince {


	public static void main(String[] args) {
		
		String searchString = "Province6";
		String[] provinces = {"Province1","Province2","Province3","Province4","Province5","Province6","Province7","Province8","Province9","Province10"};
		changeProvince(provinces[1]);
		System.out.println("02. Singe element of array sent to change: "+ provinces[1]);
		
		changeProvince(provinces);
		System.out.println("04. Array sent to change:" + provinces[1]);
	}
	public static void changeProvince(String province){
		province = "Changed";
		System.out.println("01. Single Element that was changed :" + province);
	}
	
	public static void changeProvince(String[] province){
		province[1] = "Changed";
		System.out.println("\n03. Array Element that was changed :" + province[1]);
	}
		
//		int arrayPosition = findProvince(provinces, searchString);
//		System.out.println("The province "+searchString+" was found at array position number "+arrayPosition);
//		System.out.println("Bye!");


	
	public static int findProvince(String[] provinces, String province){
		int arrayPosition = 0;
		for(arrayPosition=0; arrayPosition < provinces.length; arrayPosition++){
			if(provinces[arrayPosition] == province){
				return arrayPosition;
			}
		}
		
	 return 0;	
	}
	

}
