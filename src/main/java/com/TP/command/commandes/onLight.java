package main.java.com.TP.command.commandes;

import main.java.com.TP.command.LightReceiver;

public class onLight extends Command {
    private LightReceiver lightReceiver;

    public onLight(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        this.lightReceiver.on();
    }

    @Override
    public void undo() {
    this.lightReceiver.off();
    }
}
