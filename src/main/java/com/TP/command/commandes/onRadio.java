package main.java.com.TP.command.commandes;

import main.java.com.TP.command.RadioReceiver;

public class onRadio extends Command {

    private RadioReceiver radioReceiver;

    public onRadio(RadioReceiver radioReceiver) {
        this.radioReceiver = radioReceiver;
    }

    @Override
    public void execute() {
      this.radioReceiver.on();
    }

    @Override
    public void undo() {
        this.radioReceiver.off();
    }
}
