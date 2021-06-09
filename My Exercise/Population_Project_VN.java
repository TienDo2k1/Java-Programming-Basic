
/** This is a programming computer the population project in VIETNAM */
public class Population_Project_VN {
	/** Main method */
	public static void main(String[] args) {
		// Display the population in VIETNAM is 96883015
		System.out.println("The population in Vietnam is 96883015"); // Source: The United Nations
		
		// Store current as variable intPop
		double intPop = 96883015;
		
		// Add one birth every 20 seconds; Subtract one death every 56 seconds; Add one immigrant every 207 seconds
		// 1 year = 365 days || 1 day = 24 hours || 1 hour = 60 minutes || 1 minute = 60 seconds
		// 20 seconds = 1 birth || 56 seconds = 1 death || 207 seconds = 1 immigrant
		
		// 365 days * 24 hours * 60 minutes * 60 seconds = 31356000 seconds
		double numberSecondsInYear = 31356000;
		
		// After 1 year, number of births (20 seconds = 1 birth | plus)
		double birthsPerYear = numberSecondsInYear / 20;
		System.out.println("Births Per Year: " + birthsPerYear);
		
		// After 1 year, number of deaths (56 seconds = 1 death | plus)
		double deathsPerYear = numberSecondsInYear / 56;
		System.out.println("Deaths Per Year: " + deathsPerYear);
		
		// After 1 year, number of immigrants (207 seconds = 1 immigrant | plus)
		double immigrantsPerYear = numberSecondsInYear / 207;
		System.out.println("Immigrants Per Year: " + immigrantsPerYear);
		
		// Rate per year the population in VIETNAM
		double ratePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;
		System.out.println("Rate per year: " + ratePerYear);
		
		// Display the population in VIETNAM (year 2020 to 2031 with t = 1 (2020) to t = 12 (2031)
		for (int i = 1; i <= 12; i++) {
			int population = (int)(intPop + i * ratePerYear); 
			System.out.println("The t = "+ i + " population is: " + population);
		}
	}
}
