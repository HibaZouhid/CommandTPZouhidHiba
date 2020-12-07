package main.java.com.TP.command.commandes;

import main.java.com.TP.command.RadioReceiver;

public class offRadio extends Command {
    private RadioReceiver radioReceiver;

    public offRadio(RadioReceiver radioReceiver) {
        this.radioReceiver = radioReceiver;
    }

    @Override
    public void execute() {
        this.radioReceiver.off();
    }

    @Override
    public void undo() {
        this.radioReceiver.on();

    }
}
