package com.example.factory_method;

import com.example.factory_abstract.Cheese;
import com.example.factory_abstract.Clams;
import com.example.factory_abstract.Dough;
import com.example.factory_abstract.Pepperoni;
import com.example.factory_abstract.Sauce;
import com.example.factory_abstract.Veggies;
import java.util.ArrayList;

//  Created by xubinggui on 8/28/16.
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
public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected ArrayList<String> toppings = new ArrayList<>();

    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    //void prepare() {
    //    System.out.println("Preparing " + name);
    //    System.out.println("Tossing dough...");
    //    System.out.println("Adding sauce");
    //    System.out.println("Adding toppings: ");
    //    for (String name : toppings) {
    //        System.out.println("  " + name);
    //    }
    //}
    protected abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
