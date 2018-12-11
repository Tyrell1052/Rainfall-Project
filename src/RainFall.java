import java.util.Scanner;

public class RainFall {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter amount of years");
        String year = keyboard.nextLine();
        int numYear;
        numYear = Integer.parseInt(year);

        int [][] rain = new int [numYear][12];
        for(int years = 0; years < rain.length; years++){

            for(int month = 0; month < 12; month++){
                System.out.println("Enter the rain amount for month" + (month) + "for year" + (years+1)+":");
                String rainInches = keyboard.nextLine();
                int numInch;
                numInch = Integer.parseInt(rainInches);
                rain [years][month] = numInch;

                while(rain[years][month] <= 0){
                    System.out.println("Invalid: Input must be of a positive integer starting at 1");


                }
            }

            int minimumAmount = rain [0][0];
            int maximumAmount = rain[0][0];
            int minimumYear = 0;
            int maximumYear = 0;
            int minimumMonth = 0;
            int maximumMonth = 0;

            int total = 0;
            int grandTotal = 0;


            for( years = 0; years < numYear; years++){
                for(int month = 0; month < 12; month++){
                    if(rain[years][month] < minimumAmount){
                        minimumAmount = rain[years][month];
                        minimumMonth = month;
                        minimumYear = years;

                    }
                    if(rain[years][month] > maximumAmount){
                        maximumAmount = rain[years][month];
                        maximumMonth = month;
                        maximumYear = years;
                    }
                    total += rain[years][month];
                }
                System.out.println("Year" + (years + 1) + "Total Rainfall:" + total);
                System.out.println("Year" + (years + 1) + " Average Rainfall:" + total/12);
                grandTotal += total;
                total = 0;

            }
            System.out.println("Total amount of rainfall: " + (grandTotal));
            System.out.println("Average amount of rainfall:" + grandTotal/numYear * 12);
            System.out.println("Minimum amount of rainfall for month:" + (minimumMonth+1)+"year" + (minimumYear+1));
            System.out.println("Maximum amount of rainfall for month:" + (maximumMonth+1) + "year" + (maximumYear+1));

        }



    }



}
