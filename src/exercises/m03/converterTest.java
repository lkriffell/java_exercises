package exercises.m03;

public class converterTest extends Converter {
	static double feet = 1.0;
	static double meters = 20.0;
	public static Object[][] table = new String[11][];
	
	public static void main(String[] args) {
		table[0] = new String[] { "Feet", "Meters", "|", "Meters", "Feet" };
		
		System.out.format("%15s%15s%5s%15s%15s%n", table[0]);
		
		for (int i = 1; i < table.length; i++) {
			String footToMeter = String.valueOf(Converter.footToMeter(feet));
			String meterToFoot = String.valueOf(Converter.meterToFoot(meters));
			
			table[i] = new String[] { String.valueOf(feet), footToMeter, "|", String.valueOf(meters), meterToFoot };
			System.out.format("%15s%15s%5s%15s%15s%n", table[i]);
			
			feet += 1;
			meters += 5;
		}
	}
}
