package com.example;

//  Created by xubinggui on 9/4/16.
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
public class PeacefulState implements State {

    private Mammoth mammoth;

    public PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }

    @Override public void onEnterState() {
        System.out.println(String.format("%s calms down.", mammoth));
    }

    @Override public void observe() {
        System.out.println(String.format("%s is calm and peaceful.", mammoth));
    }
}
