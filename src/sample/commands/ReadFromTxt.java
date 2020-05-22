package sample.commands;

import sample.Controller;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadFromTxt extends Command{
    public ReadFromTxt(Controller controller){
        super(controller);
    }
    public void execute(){
        //PrintWriter writers = new PrintWriter("tablica.txt");
        // writers.println("siema");
        // System.out.println("dziala");
        File file = new File("plik.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String result;
            while((result = br.readLine()) !=null)
                controller.output.setText(String.valueOf(result));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
