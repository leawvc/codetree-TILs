import java.util.Scanner;

class Weather{

    String time;
    String day;
    String wea;

    public Weather(String time, String day, String wea){
        this.time = time;
        this.day = day;
        this.wea = wea;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Weather [] weathers = new Weather[n];
        
        for(int i = 0; i < n; i++){
            String time = sc.next();
            String day = sc.next();
            String wea = sc.next();

            weathers[i] = new Weather(time, day, wea);
        }
        int min = -1;  // 초기화

        for(int i = 0; i < n; i++){
            if(weathers[i].wea.equals("Rain")) {
                if(min == -1 || weathers[i].time.compareTo(weathers[min].time) < 0){
                    min = i;
                }
            }
        }
        System.out.printf("%s %s %s",weathers[min].time, weathers[min].day, weathers[min].wea);
    }
}