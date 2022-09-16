package com.example.mugcake_clicker;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class HelloApplication extends Application {

    public long mugAdd = 1;
    public long total = 5000;

    public long requisAchat1 = 50;

    public long requisAchat2 = 200;

    public long requisAchat3 = 10;

    public long requisAchat4 = 100;

    public long requisAchat5 = 2000;

    public long nbMugParSeconde = 0;

    @Override
    public void start(Stage stage) throws IOException {

        stage.setWidth(400);
        stage.setHeight(400);

        Label titre = new Label("Mugcake Clicker");
        titre.setTranslateX(150);
        titre.setTranslateY(10);
        titre.setScaleX(2);
        titre.setScaleY(2);

        Label nbMug = new Label("Nombre de Mugcake : ");
        nbMug.setTranslateX(10);
        nbMug.setTranslateY(60);

        Label ameliorationClic = new Label("Amélioration clic: ");
        ameliorationClic.setTranslateX(150);
        ameliorationClic.setTranslateY(90);

        Label ameliorationTotal = new Label("Amélioration total: ");
        ameliorationTotal.setTranslateX(150);
        ameliorationTotal.setTranslateY(150);

        Label ameliorationSec = new Label("Amélioration sec: ");
        ameliorationSec.setTranslateX(150);
        ameliorationSec.setTranslateY(180);

        Label mugcake = new Label(total + "");
        mugcake.setTranslateX(130);
        mugcake.setTranslateY(60);

        Label parClic = new Label("Mugcake / clic : ");
        parClic.setTranslateX(250);
        parClic.setTranslateY(40);

        Label parSec = new Label("Mugcake / sec : ");
        parSec.setTranslateX(250);
        parSec.setTranslateY(60);

        Label nbParClic = new Label(mugAdd + "");
        nbParClic.setTranslateX(340);
        nbParClic.setTranslateY(40);

        Label nbParSec = new Label(nbMugParSeconde + "");
        nbParSec.setTranslateX(340);
        nbParSec.setTranslateY(60);


        Label prixAchat1 = new Label(requisAchat1 + "");
        prixAchat1.setTranslateX(300);
        prixAchat1.setTranslateY(90);

        Label prixAchat2 = new Label(requisAchat2 + "");
        prixAchat2.setTranslateX(300);
        prixAchat2.setTranslateY(150);

        Label prixAchat3 = new Label(requisAchat3 + "");
        prixAchat3.setTranslateX(300);
        prixAchat3.setTranslateY(120);

        Label prixAchat4 = new Label(requisAchat4 + "");
        prixAchat4.setTranslateX(300);
        prixAchat4.setTranslateY(180);

        Label prixAchat5 = new Label(requisAchat5 + "");
        prixAchat5.setTranslateX(300);
        prixAchat5.setTranslateY(210);

        Button achat1 = new Button("+1");
        achat1.setDisable(true);
        achat1.setOnAction((ActionEvent) -> {  if(total >= requisAchat1) {
                                            total -= requisAchat1;
                                            if(total < requisAchat1) {
                                                achat1.setDisable(true);}
                                            requisAchat1 = requisAchat1 * 3;
                                            prixAchat1.setText(requisAchat1 + "");
                                            mugcake.setText(total + "");
                                            mugAdd = mugAdd * 2;
                                            nbParClic.setText((mugAdd + "" ));
                                            achat1.setText("+" + mugAdd);}});

        achat1.setTranslateX(250);
        achat1.setTranslateY(90);

        Button achat2 = new Button("x2");
        achat2.setDisable(true);
        achat2.setOnAction((ActionEvent) -> {  if(total >= requisAchat2) {
                            total -= requisAchat2;
                            if(total < requisAchat2) {
                                achat2.setDisable(true);}
                            total = total * 2;
                            requisAchat2 = requisAchat2 * 10;
                            prixAchat2.setText(requisAchat2 + "");
                            mugcake.setText(total + "");}});

        achat2.setTranslateX(250);
        achat2.setTranslateY(150);

        Button achat3 = new Button("+1");
        achat3.setDisable(true);
        achat3.setOnAction((ActionEvent) -> {  if(total >= requisAchat3) {
            total -= requisAchat3;
            if(total < requisAchat3) {
                achat3.setDisable(true);}
            requisAchat3 = requisAchat3 + 10;
            prixAchat3.setText(requisAchat3 + "");
            mugcake.setText(total + "");
            mugAdd = mugAdd + Integer.parseInt(achat3.getText().substring(1));
            nbParClic.setText((mugAdd + "" ));
            achat1.setText("+" + mugAdd);
            achat3.setText("+" + (Integer.parseInt(achat3.getText().substring(1)) + 1));}});

        achat3.setTranslateX(250);
        achat3.setTranslateY(120);

        Button achat5 = new Button("x2");
        achat5.setDisable(true);
        achat5.setOnAction((ActionEvent) -> {  if(total >= requisAchat2) {
            total -= requisAchat5;
            if(total < requisAchat5) {
                achat5.setDisable(true);}
            nbMugParSeconde = nbMugParSeconde * 2;
            requisAchat5 = requisAchat5 * 20;
            prixAchat5.setText(requisAchat5 + "");
           nbParSec.setText(nbMugParSeconde + "");}});

        achat5.setTranslateX(250);
        achat5.setTranslateY(210);

        //désolé pour le désordre java voulait pas compiler sinon...
        Button achat4 = new Button("+1");
        achat4.setDisable(true);
        achat4.setOnAction((ActionEvent) -> {  if(total >= requisAchat3) {
            total -= requisAchat4;
            if(total < requisAchat4) {
                achat4.setDisable(true);}
            requisAchat4 = requisAchat4 + 30;
            prixAchat4.setText(requisAchat4 + "");
            mugcake.setText(total + "");
            nbMugParSeconde += Integer.parseInt(achat4.getText().substring(1));
            nbParSec.setText((nbMugParSeconde+ "" ));
            achat5.setText("+" + mugAdd);
            achat4.setText("+" + (Integer.parseInt(achat4.getText().substring(1)) + 1));}});

        achat4.setTranslateX(250);
        achat4.setTranslateY(180);


        Button buttonCentral = new Button();
        Image img = new Image("M:\\Code\\Prog3\\mugcake clicker\\src\\main\\java\\com\\example\\mugcake_clicker\\OIP.jpg");
        ImageView view = new ImageView(img);

        buttonCentral.setGraphic(view);
        buttonCentral.setOnAction((actionEvent) -> {    total += mugAdd; // mugcake.setText((Integer.parseInt(mugcake.getText()) + mugAdd) + "" )
            refresh(mugcake, achat1, achat2, achat3, achat4, achat5);

        });


        buttonCentral.setScaleX(0.25);
        buttonCentral.setScaleY(0.25);
        buttonCentral.setTranslateX(-170);
        buttonCentral.setTranslateY(-80);

        Timeline tm = new Timeline();
        tm.setCycleCount(Timeline.INDEFINITE);
        tm.getKeyFrames().addAll(new KeyFrame(Duration.seconds(1), event -> {
            total +=nbMugParSeconde;
            refresh(mugcake, achat1, achat2, achat3, achat4, achat5);
        }));
        tm.play();


        Group root = new Group(titre, nbMug, mugcake, parClic, nbParClic, buttonCentral, achat1, prixAchat1,
                prixAchat2, achat2, prixAchat3, achat3, achat4, prixAchat4, achat5, prixAchat5, parSec, nbParSec,
                ameliorationTotal, ameliorationClic, ameliorationSec);
        Scene scene = new Scene(root);
        stage.setTitle("Mugcake clicker");
        stage.setScene(scene);
        stage.show();


    }

    public void refresh(Label mugcake, Button achat1, Button achat2, Button achat3, Button achat4,Button achat5){
        mugcake.setText(total + "");
        if(total >= requisAchat1) {
            achat1.setDisable(false);}

        else{
            achat1.setDisable(true);
        }

        if(total >= requisAchat2) {
            achat2.setDisable(false);}

        else{
            achat2.setDisable(true);
        }

        if(total >= requisAchat3) {
            achat3.setDisable(false);}

        else{
            achat3.setDisable(true);
        }

        if(total >= requisAchat4) {
            achat4.setDisable(false);}

        else{
            achat4.setDisable(true);
        }

        if(total >= requisAchat5) {
            achat5.setDisable(false);}

        else{
            achat5.setDisable(true);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
