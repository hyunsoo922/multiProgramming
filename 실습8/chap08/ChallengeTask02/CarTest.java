package chap08.ChallengeTask02;


import java.text.SimpleDateFormat;
import java.util.Date;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");
        if(myCar.equals(yourCar))
        {
            System.out.println("내 자동차는 ["+myCar.toString()+"], 너 자동차는 ["+yourCar.toString()+"]로 모델이 동일하다.");
        }else
        {
            System.out.println("내 자동차는 ["+myCar.toString()+"], 너 자동차는 ["+yourCar.toString()+"]로 모델이 다르다.");
        }
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("날짜: "+s.format(d)+", 자동차 모델=["+myCar.toString()+"], 운전자(홍길동)");
    }
}
