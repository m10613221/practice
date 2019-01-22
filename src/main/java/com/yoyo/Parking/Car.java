package com.yoyo.Parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }


    //取得離場時間
    public void leave() {
        leave=LocalDateTime.now();
    }

    //設定離場時間
    public void setLeave(LocalDateTime leave) {
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }
    //取得停車時間
    public long getDuration(){
        Duration duration=Duration.between(enter,leave);
        return duration.toMinutes();
    }
}
