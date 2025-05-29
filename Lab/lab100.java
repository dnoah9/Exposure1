package Lab;
public class lab100 {
        public static void main(String[] args) {
            System.out.println("Lab, 100 point version\n");

            int seconds = 10000;
            int hours = seconds / 3600;
            int remainder = seconds % 3600;
            int minutes = remainder / 60;
            int remainderSec = remainder % 60;
            int milliseconds = seconds%1000;
            int startingMilliseconds =100023;
            int Milliseconds = startingMilliseconds / 1000;
            System.out.println("Starting seconds: \t" + seconds);
            System.out.println("hours: \t\t\t\t" + hours);
            System.out.println("minutes: \t\t\t" + minutes);
            System.out.println("remainderSec: \t\t" + remainderSec);
            System.out.println("milliseconds: \t" + milliseconds);
            System.out.println(hours +  " hours " + minutes + " minutes " + remainderSec + " seconds ");




        }




    }


