package main.java.com.TP.command.commandes;

import main.java.com.TP.command.TVReceiver;

public class onTV extends Command {

    private TVReceiver tvReceiver;

    public onTV(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        this.tvReceiver.on();

    }

    @Override
    public void undo() {
this.tvReceiver.off();

    }
}
