package Lab;
public class lab100 {

    public static void main(String[] args) {
        System.out.println("Lab, 100 point version\n");

        int Starting_seconds= 10000;
        int hours= Starting_seconds/3600;
        int remainder = Starting_seconds % 3600;
        int minutes = remainder/60;
        int seconds = remainder%60;
        int Starting_milliseconds=10000123;
        int milliseconds = Starting_milliseconds%1000;
        System.out.println(" Starting seconds: \t"+ Starting_seconds);
        System.out.println(" Hours: \t\t\t\t"+ hours);
        System.out.println(" Minutes: \t\t\t   "+ minutes);
        System.out.println(" Seconds : \t\t\t   "+ seconds);
        System.out.println(" Milliseconds: \t\t   "+ milliseconds);
        System.out.println( hours + " hours, " +minutes + " minutes, " + seconds + " seconds, " + milliseconds + " milliseconds" );





    }




        }



