package sample.commands;

import com.sun.deploy.util.ArrayUtil;
import javafx.scene.control.TextInputDialog;
import sample.Controller;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AddNewTable extends Command {
    public AddNewTable(Controller controller){
        super(controller);
    }
    public void execute(){
       // TextInputDialog dialog = new TextInputDialog(" ");
        //dialog.setTitle("Wprowadzanie liczb");
       // dialog.setHeaderText("Podaj 5 liczb");
        //dialog.setContentText("Wprowadz tutaj: ");
        //int[] a = {1,2,3,4,5};

        //int[] c = new int[a.length];
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(2,3,4,5,6);

        List<Integer> result = IntStream.range(0, numbers.size())
                .mapToObj(i -> numbers.get(i) +numbers2.get(i))
                .collect(Collectors.toList());

    controller.output.setText(String.valueOf(result));

        /*for (int i = 0; i < a.length; ++i) {
            Optional<String> result = dialog.showAndWait();
            if(result.isPresent()){
                int b = Integer.valueOf(result.get());
                c[i] = a[i] + b;
            }*/


        }
        //controller.output.setText(Arrays.toString(c));
    //}
}
