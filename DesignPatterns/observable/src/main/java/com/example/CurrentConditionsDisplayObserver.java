package com.example;

import java.util.Observable;

//  Created by xubinggui on 8/27/16.
//                            _ooOoo_  
//                           o8888888o  
//                           88" . "88  
//                           (| -_- |)  
//                            O\ = /O  
//                        ____/`---'\____  
//                      .   ' \\| |// `.  
//                       / \\||| : |||// \  
//                     / _||||| -:- |||||- \  
//                       | | \\\ - /// | |  
//                     | \_| ''\---/'' | |  
//                      \ .-\__ `-` ___/-. /  
//                   ___`. .' /--.--\ `. . __  
//                ."" '< `.___\_<|>_/___.' >'"".  
//               | | : `- \`.;`\ _ /`;.`/ - ` : | |  
//                 \ \ `-. \_ __\ /__ _/ .-` / /  
//         ======`-.____`-.___\_____/___.-`____.-'======  
//                            `=---='  
//  
//         .............................................  
//                  佛祖镇楼                  BUG辟易 
public class CurrentConditionsDisplayObserver implements java.util.Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private Observable weatherData;

    public CurrentConditionsDisplayObserver(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override public void display() {
        System.out.print("Current conditions: " + temperature + "F degree and " + humidity + "% humidity");
    }

    @Override public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataObservable) {
            WeatherDataObservable weatherDataObservable = (WeatherDataObservable) o;
            this.temperature = weatherDataObservable.getTemperature();
            this.humidity = weatherDataObservable.getHumidity();
            display();
        }
    }
}
