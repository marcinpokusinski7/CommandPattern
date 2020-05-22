package sample.commands;

import sample.Controller;

import java.util.Stack;

public class UndoOperation{
    private Stack<Command> history = new Stack<>();

    public void push(Command c){
        history.push(c);
    }
    public Command pop() {
        return history.pop();

    }
    public boolean isEmpty(){
        return history.isEmpty();
    }
}
