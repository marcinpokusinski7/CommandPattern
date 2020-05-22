package sample.commands;

import com.sun.deploy.uitoolkit.impl.fx.ui.FXMessageDialog;
import com.sun.jnlp.ApiDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import sample.Controller;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class WriteToTxt extends Command {
    public WriteToTxt(Controller controller){
        super(controller);
    }
    public void execute(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        FileWriter fw = null;
        try{
        fw = new FileWriter("plik.txt");
        }catch (IOException e){
            e.printStackTrace();
    }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(String.valueOf(numbers));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bw.close();
            fw.close();
            Desktop desktop = Desktop.getDesktop();
            File file = new File("plik.txt");
            desktop.open(file);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    }


