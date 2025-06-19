package org.icecream.command;

public interface OrderCommand {
    void execute();
    void undo();
}
