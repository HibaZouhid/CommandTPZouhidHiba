package main.java.com.TP.command.commandes;

import main.java.com.TP.command.TVReceiver;

public class offTV extends Command {
    private TVReceiver tvReceiver;

    public offTV(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        this.tvReceiver.off();

    }

    @Override
    public void undo() {
        this.tvReceiver.on();

    }
}
