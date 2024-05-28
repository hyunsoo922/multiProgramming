package chap08.ChallengeTask03;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy");
        String output = "날짜: "+s.format(d)+", 자동차 모델=["+myCar.toString()+"], 운전자(홍길동)";
        StringTokenizer st = new StringTokenizer(output," , =[ ], ( )");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
