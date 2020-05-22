package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import javax.xml.soap.Text;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Command Pattern");
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
        /*
        TilePane r = new TilePane();
        TextField field = new TextField("zadanie");
        Button button = new Button("Wypisz tablice");
        Button button2 = new Button("Odczytaj tablice z pliku tekstowego");
        Button button3 = new Button("Dodaj tablice do innej");
        Button button4 = new Button("Pomnóż tablice przez liczbę");
        Button button5 = new Button("Cofnij zmiany");
        r.getChildren().add(field);
        r.getChildren().add(button);
        r.getChildren().add(button2);
        r.getChildren().add(button3);
        r.getChildren().add(button4);
        r.getChildren().add(button5);
        Scene sc = new Scene(r, 600, 450);
        primaryStage.setScene(sc);
        */
    }


    public static void main(String[] args) {

        launch(args);
    }
}
