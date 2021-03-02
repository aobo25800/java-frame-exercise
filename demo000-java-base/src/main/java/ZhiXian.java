import java.time.Duration;
import java.time.LocalDateTime;

public class ZhiXian {
    public static boolean inRoute(double x1, double y1, double x2, double y2, double x3, double y3) {

        double k, b, t;

        k = (y2-y1)/(x2-x1);

        b = y1 - k * x1;
        t = k * x1 + b;
        // 判断在同一条直线内，误差值0.1
        if (Math.abs(y1 -t) < 0.2){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String [] args){
//        System.out.println(inRoute(75.82, 27.07, 40, 26.5, -2, 26.5));
        System.out.println(Duration.between(LocalDateTime.now().minusMinutes(5), LocalDateTime.now()).toMinutes());
    }
}
