package com.example.factory_abstract;

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
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic() };
        return veggies;
    }

    @Override public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override public Clams createClam() {
        return new FreshClams();
    }
}
