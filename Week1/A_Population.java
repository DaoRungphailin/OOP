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