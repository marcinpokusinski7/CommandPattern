package sample.commands;

import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import sample.Controller;
import java.util.Arrays;


public class MultiplyTable extends Command {
    public MultiplyTable(Controller controller){
        super(controller);
    }
    public void execute(){

        int[] tab = {1,2,3,4,5};
        if(controller.input.getText().trim().isEmpty() ){
            new Alert(Alert.AlertType.ERROR, "Wprowadź liczbę").showAndWait();
        }else {

            int a = Integer.parseInt(controller.input.getText());
            for (int i = 0; i < tab.length; i++) {
                tab[i] = a * tab[i];
                controller.output.setText(Arrays.toString(tab));
            }


        }
    }
}
