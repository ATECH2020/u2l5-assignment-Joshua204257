import java.util.Scanner;
 
public class HowFarAway
{
   public static void main(String[] args)
   {
       // variables
       double sLatitude = 0;
       double sLongitude = 0;
       double eLatitude = 0;
       double eLongitude = 0;
     
       Scanner in = new Scanner(System.in);
 
       System.out.println("Enter the latitude of the starting location:");
       sLatitude = in.nextDouble();
 
       System.out.println("Enter the longitude of the starting location:");
       sLongitude = in.nextDouble();
 
       System.out.println("Enter the latitude of the ending location:");
       eLatitude = in.nextDouble();
 
       System.out.println("Enter the longitude of the ending location:");
       eLongitude = in.nextDouble();
 
       GeoLocation myGeo = new GeoLocation(sLatitude, sLongitude);
       GeoLocation myGeo2 = new GeoLocation(eLatitude, eLongitude);
 
       System.out.println("The distance is " + myGeo.distanceFrom(myGeo2) + " miles.");
   }
}
