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
public class App {

    public static void main(String[] args) {
        System.out.println("Message from the orcs: ");

        LetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();

        System.out.println("\n");

        System.out.println("Message from the elves: ");

        LetterComposite elfMessage = new Messenger().messageFromElves();
        elfMessage.print();
    }
}
