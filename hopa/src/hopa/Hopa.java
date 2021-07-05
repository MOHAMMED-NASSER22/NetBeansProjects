/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hopa;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Mohamed Nasser
 */
public class Hopa extends Application {
    
    @Override
    public void start(Stage s) {
      Button btn = new Button();
      btn.setText("calculate");
      GridPane MyGrid = new GridPane();
      MyGrid.add(new Label("Investment Amount "),0,0);
      MyGrid.add(new Label("Number of Years "),0,1);
      MyGrid.add(new Label("Annual Interest Rate "),0,2);
      MyGrid.add(new Label("Future Value "),0,3);
      TextField txtAmount=new TextField();
      TextField N=new TextField();
      TextField I=new TextField();
      TextField F=new TextField();
      MyGrid.add(txtAmount,1,0);
      MyGrid.add(N,1,1);
      MyGrid.add(I,1,2);
      MyGrid.add(F,1,3);
      Button btnCalc = new Button("Calculte");
      MyGrid.add(btnCalc,1,4);
      GridPane.setHalignment(btnCalc, HPos.RIGHT);
      Scene scene = new Scene(MyGrid,600,250);
      MyGrid.setPadding(new Insets(12,12,12,12));
      s.setScene(scene);
      MyGrid.setHgap(15);
      MyGrid.setVgap(15);
      s.show();
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
