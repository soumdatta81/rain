import java.util.Scanner;

public class rain {
    //write a java program to make it flood only during college hours 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter when class starts : ");
        int time = in.nextInt();
        String weather = "Thunderstorm and heavy rainfall and heavy flood in Silchar town ";
        String rain = " It is raining and raining i cannot come";
        
        
       if(time>=9 && time<=12){
            System.out.println("WEATHER UPDATE : ");
            System.out.println(weather);
            System.out.print("Hence , ");
            System.out.println(rain);
       }
       else{
                System.out.println("Weather is good lets have sex");
       }

         }
        }