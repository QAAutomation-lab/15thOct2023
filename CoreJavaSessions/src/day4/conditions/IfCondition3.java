package day4.conditions;

public class IfCondition3 {
	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 18;
		int weight = 51;
		char grp = 'B';
		// applying condition on age and weight
		if (age >= 18)
		{
			System.out.println("Welcome your age is matched");
			if (weight > 50) 
			{
				System.out.println("Congrats you weight is matched");
				if (grp == 'A') 
				{
					System.out.println("You are eligible to donate blood");
				} else {
					System.out.println("You are not eligible to donate blood, as your bloood group is not matching");
				}
			} 
			else{
				System.out.println("You are not eligible to donate blood, your weight is below 50");
			}
		} 
		else {
			System.out.println("You are not eligible to donate blood, as your age is below 18");
		}
	}
}