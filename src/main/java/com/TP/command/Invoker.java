package main.java.com.TP.command;

import main.java.com.TP.command.commandes.Command;

public class Invoker {

    private Command[] commandsON;
    private Command[] commandsOFF;
    private Command annulation;

    public Invoker(){
        commandsON=new Command[3];
        commandsOFF=new Command[3];
    }

    public void setCommand(int i,Command commandOn,Command commandOFF){
        this.commandsON[i]=commandOn;
        this.commandsOFF[i]=commandOFF;
    }

    public void buttonON(int i){
        this.commandsON[i].execute();
        this.annulation=this.commandsON[i];
    }

    public void buttonOFF(int i){
        this.commandsOFF[i].execute();
        this.annulation=this.commandsOFF[i];
    }
    public void undo(){
        this.annulation.undo();

    }







}
