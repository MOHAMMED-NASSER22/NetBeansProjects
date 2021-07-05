/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store.numbers.gui;

import java.util.Collections;
import java.util.LinkedList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nasser
 */

// PROGRAMMING EXERCISES *20.2  page 814
public class StoreNumbersGUI extends Application {
        TextField textField = new TextField();
        TextArea textArea = new TextArea();
        LinkedList<Integer> list = new LinkedList<>();
    public void start(Stage primaryStage) {
        

    
        Button btSort = new Button("Sort");
        Button btShuffle = new Button("Shuffle");
        Button btReverse = new Button("Reverse");
        
        HBox Texts = new HBox(10);
        Texts.getChildren().addAll(
        new Label("enter a number:") , textField);
        Texts.setAlignment(Pos.CENTER);
        
        HBox Buttons = new HBox(10);
        Buttons.getChildren().addAll(btSort,btShuffle,btReverse);
        Buttons.setAlignment(Pos.CENTER);
        
        textArea.setEditable(false);
        textArea.setWrapText(true);
        
        BorderPane pane = new BorderPane();
        pane.setTop(Texts);
        pane.setCenter(textArea);
        pane.setBottom(Buttons);
        
        textField.setOnAction(e ->{add();});
        
        btSort.setOnAction( e-> {
        Collections.sort(list);
        displayText();
        
        });
        
        btShuffle.setOnAction( e-> {
        Collections.shuffle(list);
        displayText();
        
        });
        
        
        btReverse.setOnAction( e-> {
        Collections.sort(list,Collections.reverseOrder());
        displayText();
        
        });
        
        Scene scene = new Scene(pane , 400 , 200);
        primaryStage.setTitle("PROGRAMMING EXERCISES *20.2");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        
    }
    
    void add(){
        list.addLast(Integer.parseInt(textField.getText()));
        displayText();
    }
    
    void displayText(){
        String output = "";
        
        for(Integer e : list)
            output =  output + e + " ";
        
        textArea.setText(output);
        textField.setText("");
    }

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
