package main.java.com.TP.command;

import main.java.com.TP.command.commandes.*;

public class Client {
    public static void main(String[] args) {

        Invoker invoker=new Invoker();

        TVReceiver tvReceiver=new TVReceiver();
        RadioReceiver radioReceiver=new RadioReceiver();

        Command commandTVON=new onTV(tvReceiver);
        Command commandTVOFF=new offTV(tvReceiver);
        Command commandRadioON=new onRadio(radioReceiver);
        Command commandRadioOFF=new offRadio(radioReceiver);

        invoker.setCommand(0,commandTVON,commandTVOFF);
        invoker.setCommand(1,commandRadioON,commandRadioOFF);

        invoker.buttonON(0);
        invoker.undo();
        invoker.buttonOFF(0);
        invoker.buttonON(1);
    }
}
