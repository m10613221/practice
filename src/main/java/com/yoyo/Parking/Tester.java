package com.yoyo.Parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2019, 1, 22, 1, 0, 0);
        LocalDateTime leave = LocalDateTime.of(2019, 1, 22, 5, 5, 0);

        Car car = new Car("888-abc", enter);
        car.setLeave(leave);
        long duration = car.getDuration();
        System.out.println(duration);
        long hours=(long) Math.ceil(duration/60f);
        System.out.println(hours);
        long cost=hours*30;
        System.out.println(cost);
//        java8();
//        java();
    }

    private static void java8() {
        //格林威治時間
        Instant instant = Instant.now();
        System.out.println(instant);
        //當地時間
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //轉換時間顯示格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        //可更改時間，但不會更改原始值
        System.out.println(now.plus(Duration.ofDays(5)));
        //自訂時間，並轉換成時間格式
        LocalDateTime other = LocalDateTime.of(2018, 12, 25, 15, 25, 22);
        System.out.println(other);
    }

    private static void java() {
        //取得當下時間
        Date date = new Date();
        System.out.println(date);
        //轉換時間格式，可依照自訂格式做顯示
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        //將自訂的時間，轉換為Date類別顯示的格式
        String myDate = "2019/01/15 20:22:55";
        try {
            Date other = sdf.parse(myDate);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 5);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR, 4);
        System.out.println(calendar.getTime());
    }
}
