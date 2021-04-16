package exercises.m02;

public class weightConverter {
	public static Object[][] table = new String[101][];
	public static String kilos = "1";
	public static String pounds = "20";
	
	public static void main(String[] args) {
		table[0] = new String[] { "Kilograms", "Pounds", "|", "Pounds", "Kilograms" };
		System.out.format("%15s%15s%5s%15s%15s%n", table[0]);
		
		for (int i = 1; i < table.length; i++) {
			table[i] = new String[] { kilos, kilosToPounds(), "|", pounds, poundsToKilos() };
			System.out.format("%15s%15s%5s%15s%15s%n", table[i]);
		}
	}
	
	public static String kilosToPounds() {
		double kilosDouble = Double.parseDouble(kilos);
		double pounds = Math.round((kilosDouble * 2.2046226218) * 100.0) / 100.0;
		kilosDouble += 2;
		kilos = String.valueOf(kilosDouble);
		return String.valueOf(pounds);
	}
	
	public static String poundsToKilos() {
		double poundsDouble = Double.parseDouble(pounds);
		double kilos = Math.round((poundsDouble * 0.45359237) * 100.0) / 100.0;
		poundsDouble += 5;
		pounds = String.valueOf(poundsDouble);
		return String.valueOf(kilos);
	}
}
