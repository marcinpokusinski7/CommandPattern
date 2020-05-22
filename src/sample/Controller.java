package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.commands.*;

import static java.lang.Compiler.command;

public class Controller {
    Controller controller = this;
    private UndoOperation history = new UndoOperation();
        @FXML
        public Button writetotxt, multiplytable, addnewtable, readfromtxt, undo;
        @FXML
        public TextField input, output;
        @FXML
        public void initialize(){



            multiplytable.setOnAction(event -> {
                executeCommand(new MultiplyTable(controller));
            });

             writetotxt.setOnAction(event -> {
                 executeCommand(new WriteToTxt(controller));
             });
             addnewtable.setOnAction(event -> {
                 executeCommand(new AddNewTable(controller));
             });
            readfromtxt.setOnAction(event -> {
                executeCommand(new ReadFromTxt(controller));
            });

            undo.setOnAction(event -> {
                undo();
            });
        }
        private void executeCommand(Command command){
            command.execute();
            history.push(command);
            }
            private void undo(){
            if(history.isEmpty()) return;

            Command command = history.pop();
            if (command != null){
                command.undo();
            }

            }



        }



