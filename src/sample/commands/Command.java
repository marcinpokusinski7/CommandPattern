package sample.commands;

import sample.Controller;

public abstract class Command {
        public Controller controller;
        private String backup;
        Command(Controller controller){
            this.controller = controller;
        }
        public abstract void execute();
        void backup(){
            backup = controller.input.getText();
        }
        public void undo(){
            controller.output.setText(backup);
        }

}
