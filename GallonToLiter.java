public class GallonToLiter {
	public static void main(String[] args) {
		//System.out.println("1 gallon	3.785 liters");
	
/*		
		int gallons = 1;
		float liters = gallons * 3.7541f;
		System.out.println(gallons+" gallons	"+liters+" liters");
		
		gallons = gallons +1;
		liters = gallons * 3.7541f;
		System.out.println(gallons+" gallons	"+liters+" liters");
		
		gallons = gallons +1;
		liters = gallons * 3.7541f;
		System.out.println(gallons+" gallons	"+liters+" liters");
		
		
*/
		
		for(int g = 1; g <= 100; g++) {
			float l = g * 3.78541f;
			System.out.println(g+" gallons	"+l+" liters");
			
			if(g % 10 == 0) {
				System.out.println("");
			}
			
		}
		
		
	}

}
	