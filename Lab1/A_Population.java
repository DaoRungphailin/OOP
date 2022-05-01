/*Program#1(Exercise 1.11 p.31Population projection) 
The U.S. Census Bureau projects population based on thefollowing assumptions:
■ One birth every 7 seconds
■ One death every 13 seconds
■ One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. 
Assume thecurrent population is 312,032,486 and one year has 365 days. 
Hint:In Java, if two integers perform division, the result is an integer. 
The fractional part is truncated. 
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). 
To get an accurate result with the fractional part, one of the values involved in the division must be a number with a decimal point. 
For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.*/
class A_Population{
    public static void main(String[] args)
    {
       int currentPopulation = 312032486;
       //Time :: second
       int year = 365*24*3600;
       int rateOfBirth = 7;
       int rateOfDeath = -13;
       int rateofImmmigrant = 45;

       //Each next 5 years
       //System.out.println(currentPopulation+(year/rateOfBirth)+(year/rateOfDeath)+(year/rateofImmmigrant));
       for(int i = 1 ; i <= 5 ; i++)
       {
           int change = (year/rateOfBirth)+(year/rateOfDeath)+(year/rateofImmmigrant);
           System.out.print("Year" + i  + ":" );
           System.out.println(currentPopulation += change);
       }
    }
}