import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {

		// BMI
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Height in (cm) ");
		double height_cm = scan.nextDouble();
		System.out.println("Please enter your Weight in (KG) ");
		double weight_kg = scan.nextDouble();

		double mul_height = height_cm / 100 * height_cm / 100;

		double bmi = weight_kg / mul_height;

		if (bmi < 18.5) {
			System.out.println("Underweight " + bmi);
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Normal weight " + bmi);
		} else if (bmi > 24.9 && bmi <= 29.9) {
			System.out.println("Overweight -- Thodi exercise to karle bhai" + bmi);
		} else if (bmi > 30) {
			System.out.println("Obesity - Motte mar jaega " + bmi);
		}
	}
}
