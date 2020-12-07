package main.java.com.TP.command.commandes;

import main.java.com.TP.command.LightReceiver;

public class offLight extends Command{
    private LightReceiver lightReceiver;

    public offLight(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.off();
    }

    @Override
    public void undo() {
        this.lightReceiver.on();
    }
}
