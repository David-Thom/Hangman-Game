import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.text.Font;
import java.lang.Integer;
import java.util.concurrent.Callable;

import static javafx.application.Application.launch;


/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author Diekolola Thompson
 */
public class HangmanGUI extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     @throws Exception
     */

    Label TitleOfQuiz;
    Label Category;
    Label theme=new Label();
    Label word = new Label();

    String strword;
    StringBuilder temp;
    Label Grade = new Label();
    Hangman game = new Hangman();



    Button A = new Button("A");
    Button B = new Button("B");
    Button C = new Button("C");
    Button D = new Button("D");
    Button E = new Button("E");
    Button F = new Button("F");
    Button G = new Button("G");
    Button H = new Button("H");
    Button I = new Button("I");
    Button J = new Button("J");
    Button K = new Button("K");
    Button L = new Button("L");
    Button M = new Button("M");
    Button N = new Button("N");
    Button O = new Button("O");
    Button P = new Button("P");
    Button Q = new Button("Q");
    Button R = new Button("R");
    Button S = new Button("S");
    Button T = new Button("T");
    Button U = new Button("U");
    Button V = new Button("V");
    Button W = new Button("W");
    Button X = new Button("X");
    Button Y = new Button("Y");
    Button Z = new Button("Z");

    Button reset = new Button("Reset Game");

    Button country = new Button("Countries");

    Button sport = new Button("Sports");

    Button dish = new Button("Dishes");


    Canvas canvas = new Canvas(800, 450); // Set canvas Size in Pixels
    GraphicsContext gc = canvas.getGraphicsContext2D();

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root, 800, 450);
        stage.setTitle("Hangman Game");
        stage.setScene(scene);

        //Canvas canvas = new Canvas(800, 450); // Set canvas Size in Pixels
        root.getChildren().add(canvas);
        //GraphicsContext gc = canvas.getGraphicsContext2D();
        // YOUR CODE STARTS HERE

        TitleOfQuiz = new Label("LET'S PLAY HANGMAN!\nThemes are COUNTRIES, SPORTS, DISHES");
        root.getChildren().addAll(TitleOfQuiz);
        TitleOfQuiz.relocate(400,0);
        TitleOfQuiz.setFont(new Font ("Arial", 25));
        TitleOfQuiz.setStyle("-fx-background-color: yellow; -fx-text-fill: black;");

        Category= new Label("Please choose a theme!");
        root.getChildren().addAll(Category);
        Category.relocate(0,30);
        Category.setFont(new Font ("Arial", 25));
        Category.setStyle("-fx-text-fill: yellow;");


        root.getChildren().addAll(word);

        root.getChildren().addAll(theme);

        root.getChildren().addAll(Grade);
/*
        Grade = new Label("You lose. Try again!");
        root.getChildren().addAll(Grade);
        Grade.relocate(400, 300);
        Grade.setFont(new Font("Arial", 16));
        Grade.setStyle("-fx-text-fill: "+game.WinningColor());*/




        A.setOnAction(this::A);
        root.getChildren().addAll(A);
        A.relocate(500, 70);
        A.setVisible(false);

        B.setOnAction(this::B);
        root.getChildren().addAll(B);
        B.relocate(525, 70);
        B.setVisible(false);

        C.setOnAction(this::C);
        root.getChildren().addAll(C);
        C.relocate(550, 70);
        C.setVisible(false);

        D.setOnAction(this::D);
        root.getChildren().addAll(D);
        D.relocate(575, 70);
        D.setVisible(false);

        E.setOnAction(this::E);
        root.getChildren().addAll(E);
        E.relocate(600, 70);
        E.setVisible(false);

        F.setOnAction(this::F);
        root.getChildren().addAll(F);
        F.relocate(625, 70);
        F.setVisible(false);

        G.setOnAction(this::G);
        root.getChildren().addAll(G);
        G.relocate(650, 70);
        G.setVisible(false);

        H.setOnAction(this::H);
        root.getChildren().addAll(H);
        H.relocate(675, 70);
        H.setVisible(false);

        I.setOnAction(this::I);
        root.getChildren().addAll(I);
        I.relocate(700, 70);
        I.setVisible(false);

        J.setOnAction(this::J);
        root.getChildren().addAll(J);
        J.relocate(725, 70);
        J.setVisible(false);

        K.setOnAction(this::K);
        root.getChildren().addAll(K);
        K.relocate(750, 70);
        K.setVisible(false);

        L.setOnAction(this::L);
        root.getChildren().addAll(L);
        L.relocate(775, 70);
        L.setVisible(false);

        M.setOnAction(this::M);
        root.getChildren().addAll(M);
        M.relocate(800, 70);
        M.setVisible(false);

        N.setOnAction(this::N);
        root.getChildren().addAll(N);
        N.relocate(500, 95);
        N.setVisible(false);

        O.setOnAction(this::O);
        root.getChildren().addAll(O);
        O.relocate(525, 95);
        O.setVisible(false);

        P.setOnAction(this::P);
        root.getChildren().addAll(P);
        P.relocate(550, 95);
        P.setVisible(false);

        Q.setOnAction(this::Q);
        root.getChildren().addAll(Q);
        Q.relocate(575, 95);
        Q.setVisible(false);

        R.setOnAction(this::R);
        root.getChildren().addAll(R);
        R.relocate(600, 95);
        R.setVisible(false);

        S.setOnAction(this::S);
        root.getChildren().addAll(S);
        S.relocate(625, 95);
        S.setVisible(false);

        T.setOnAction(this::T);
        root.getChildren().addAll(T);
        T.relocate(650, 95);
        T.setVisible(false);

        U.setOnAction(this::U);
        root.getChildren().addAll(U);
        U.relocate(675, 95);
        U.setVisible(false);

        V.setOnAction(this::V);
        root.getChildren().addAll(V);
        V.relocate(700, 95);
        V.setVisible(false);

        W.setOnAction(this::W);
        root.getChildren().addAll(W);
        W.relocate(725, 95);
        W.setVisible(false);

        X.setOnAction(this::X);
        root.getChildren().addAll(X);
        X.relocate(750, 95);
        X.setVisible(false);


        Y.setOnAction(this::Y);
        root.getChildren().addAll(Y);
        Y.relocate(775, 95);
        Y.setVisible(false);

        Z.setOnAction(this::Z);
        root.getChildren().addAll(Z);
        Z.relocate(800, 95);
        Z.setVisible(false);

        reset.setOnAction(this::reset);
        root.getChildren().addAll(reset);


        country.setOnAction(this::country);
        root.getChildren().addAll(country);
        country.relocate(0, 70);


        sport.setOnAction(this::sport);
        root.getChildren().addAll(sport);
        sport.relocate(0, 100);

        dish.setOnAction(this::dish);
        root.getChildren().addAll(dish);
        dish.relocate(0, 130);

        stage.show();
    }
    private void A(ActionEvent e) {
        temp = new StringBuilder(strword);
        if (game.getWord().contains("A")) {
            A.setVisible(false);

            for (int i=0;i<game.getWord().length();i++){
                if ((Character.compare(game.getWord().charAt(i),'A')) == 0) {
                    temp.setCharAt(i,'A');
                }
            }
            strword=temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void B(ActionEvent e) {
        temp = new StringBuilder(strword);
        if (game.getWord().contains("B")) {
            B.setVisible(false);
            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'B')) == 0) {
                    temp.setCharAt(i, 'B');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);
            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
    }
    private void C(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("C")) {
            C.setVisible(false);
            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'C')) == 0) {
                    temp.setCharAt(i, 'C');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);
            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }

    }
    private void D(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("D")) {
            D.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'D')) == 0) {
                    temp.setCharAt(i, 'D');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void E(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("E")) {
            E.setVisible(false);
            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'E')) == 0) {
                    temp.setCharAt(i, 'E');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
    }
    private void F(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("F")) {
            F.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'F')) == 0) {
                    temp.setCharAt(i, 'F');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);
            System.out.print(game.getWord().length()+"\n"+game.getLetter());
            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
    }
    private void G(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("G")) {
            G.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'G')) == 0) {
                    temp.setCharAt(i, 'G');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
            System.out.print(game.getWord());
        }
    }
    private void H(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("H")) {
            H.setVisible(false);
            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'H')) == 0) {
                    temp.setCharAt(i, 'H');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
    }
    private void I(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("I")) {
            I.setVisible(false);


            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'I')) == 0) {
                    temp.setCharAt(i, 'I');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void J(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("J")) {
            J.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'J')) == 0) {
                    temp.setCharAt(i, 'J');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
    }
    private void K(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("K")) {
            K.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'K')) == 0) {
                    temp.setCharAt(i, 'K');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);
            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void L(ActionEvent e){
        StringBuilder temp = new StringBuilder(strword);

        if (game.getWord().contains("L")) {
            L.setVisible(false);

            for (int i=0;i<game.getWord().length();i++){
                if ((Character.compare(game.getWord().charAt(i),'L')) == 0) {
                    temp.setCharAt(i,'L');
                }
            }
            strword=temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }

    private void M(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("M")) {
            M.setVisible(false);


            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'M')) == 0) {
                    temp.setCharAt(i, 'M');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void N(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("N")) {
            N.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'N')) == 0) {
                    temp.setCharAt(i, 'N');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void O(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("O")) {
            O.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'O')) == 0) {
                    temp.setCharAt(i, 'O');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void P(ActionEvent e){
        temp=new StringBuilder(strword);
        if (game.getWord().contains("P")) {
            P.setVisible(false);

            for (int i=0;i<game.getWord().length();i++){
                if ((Character.compare(game.getWord().charAt(i),'P')) == 0) {
                    temp.setCharAt(i,'P');

                }
            }
            strword=temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void Q(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("Q")) {
            Q.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'Q')) == 0) {
                    temp.setCharAt(i, 'Q');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void R(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("R")) {
            R.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'R')) == 0) {
                    temp.setCharAt(i, 'R');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void S(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("S")) {
            S.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'S')) == 0) {
                    temp.setCharAt(i, 'S');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void T(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("T")) {
            T.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'T')) == 0) {
                    temp.setCharAt(i, 'T');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void U(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("U")) {
            U.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'U')) == 0) {
                    temp.setCharAt(i, 'U');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void V(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("V")) {
            V.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'V')) == 0) {
                    temp.setCharAt(i, 'V');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);
            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void W(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("W")) {
            W.setVisible(false);

            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'W')) == 0) {
                    temp.setCharAt(i, 'W');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void X(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("X")) {
            X.setVisible(false);
            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'X')) == 0) {
                    temp.setCharAt(i, 'X');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);
            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void Y(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("Y")) {
            Y.setVisible(false);
            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'Y')) == 0) {
                    temp.setCharAt(i, 'Y');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);
            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }

        }
    }
    private void Z(ActionEvent e){
        temp = new StringBuilder(strword);
        if (game.getWord().contains("Z")) {
            Z.setVisible(false);
            for (int i = 0; i < game.getWord().length(); i++) {
                if ((Character.compare(game.getWord().charAt(i), 'Z')) == 0) {
                    temp.setCharAt(i, 'Z');
                }
            }
            strword = temp.toString();
            word.setText(temp.toString());
            word.relocate(647, 130);

            if(temp.toString().equals(game.getWord())){
                Grade.setText("You win! Play again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: green");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
        else {
            game.decrementlives();
            game.drawMAN(gc);
            if(game.getLives()==0){
                Grade.setText("Sorry, you lose. Try again!");
                Grade.relocate(400, 300);
                Grade.setFont(new Font("ROMAN", 40));
                Grade.setStyle("-fx-text-fill: red");

                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                K.setVisible(false);
                L.setVisible(false);
                M.setVisible(false);
                N.setVisible(false);
                O.setVisible(false);
                P.setVisible(false);
                Q.setVisible(false);
                R.setVisible(false);
                S.setVisible(false);
                T.setVisible(false);
                U.setVisible(false);
                V.setVisible(false);
                W.setVisible(false);
                X.setVisible(false);
                Y.setVisible(false);
                Z.setVisible(false);
            }
        }
    }
    private void country(ActionEvent e){
        sport.setVisible(false);
        dish.setVisible(false);
        country.setVisible(false);
        game.SetTheme("country");

        theme.setText("Countries");
        theme.setFont(new Font ("Arial", 25));
        theme.setStyle("-fx-text-fill: white;-fx-background-color: orange;");
        theme.relocate(0,70);

        Category.setText("");

        String w="";
        for(int i=0;i<game.getWord().length();i++){
            w=w+" ";
        }
        strword=w;
        word.setText(w);
        temp = new StringBuilder(strword);
        word.setFont(new Font ("Arial", 25));
        word.setStyle("-fx-text-fill: black;");
        game.drawSTAGE(gc);
        A.setVisible(true);
        B.setVisible(true);
        C.setVisible(true);
        D.setVisible(true);
        E.setVisible(true);
        F.setVisible(true);
        G.setVisible(true);
        H.setVisible(true);
        I.setVisible(true);
        J.setVisible(true);
        K.setVisible(true);
        L.setVisible(true);
        M.setVisible(true);
        N.setVisible(true);
        O.setVisible(true);
        P.setVisible(true);
        Q.setVisible(true);
        R.setVisible(true);
        S.setVisible(true);
        T.setVisible(true);
        U.setVisible(true);
        V.setVisible(true);
        W.setVisible(true);
        X.setVisible(true);
        Y.setVisible(true);
        Z.setVisible(true);
    }
    private void sport(ActionEvent e){
        sport.setVisible(false);
        country.setVisible(false);
        dish.setVisible(false);
        game.SetTheme("sports");

        theme.setText("Sports");
        theme.setFont(new Font ("Arial", 25));
        theme.setStyle("-fx-text-fill: white;-fx-background-color: blue;");
        theme.relocate(0,100);

        Category.setText("");

        String w="";
        for(int i=0;i<game.getWord().length();i++){
            w=w+" ";
        }
        strword=w;
        word.setText(w);

        word.setFont(new Font ("Arial", 25));
        word.setStyle("-fx-text-fill: black;");
        game.drawSTAGE(gc);
        A.setVisible(true);
        B.setVisible(true);
        C.setVisible(true);
        D.setVisible(true);
        E.setVisible(true);
        F.setVisible(true);
        G.setVisible(true);
        H.setVisible(true);
        I.setVisible(true);
        J.setVisible(true);
        K.setVisible(true);
        L.setVisible(true);
        M.setVisible(true);
        N.setVisible(true);
        O.setVisible(true);
        P.setVisible(true);
        Q.setVisible(true);
        R.setVisible(true);
        S.setVisible(true);
        T.setVisible(true);
        U.setVisible(true);
        V.setVisible(true);
        W.setVisible(true);
        X.setVisible(true);
        Y.setVisible(true);
        Z.setVisible(true);
    }
    private void dish(ActionEvent e){
        dish.setVisible(false);
        sport.setVisible(false);
        country.setVisible(false);
        game.SetTheme("dishes");

        theme.setText("Dishes");
        theme.setFont(new Font ("Arial", 25));
        theme.setStyle("-fx-text-fill: white;-fx-background-color: maroon;");
        theme.relocate(0,130);

        Category.setText("");

        String w="";
        for(int i=0;i<game.getWord().length();i++){
            w=w+" ";
        }
        strword=w;
        word.setText(w);

        word.setFont(new Font ("Arial", 25));
        word.setStyle("-fx-text-fill: black;");

        game.drawSTAGE(gc);
        A.setVisible(true);
        B.setVisible(true);
        C.setVisible(true);
        D.setVisible(true);
        E.setVisible(true);
        F.setVisible(true);
        G.setVisible(true);
        H.setVisible(true);
        I.setVisible(true);
        J.setVisible(true);
        K.setVisible(true);
        L.setVisible(true);
        M.setVisible(true);
        N.setVisible(true);
        O.setVisible(true);
        P.setVisible(true);
        Q.setVisible(true);
        R.setVisible(true);
        S.setVisible(true);
        T.setVisible(true);
        U.setVisible(true);
        V.setVisible(true);
        W.setVisible(true);
        X.setVisible(true);
        Y.setVisible(true);
        Z.setVisible(true);
    }
    private void reset(ActionEvent e) {
        game.ResetGame();
        A.setVisible(false);
        B.setVisible(false);
        C.setVisible(false);
        D.setVisible(false);
        E.setVisible(false);
        F.setVisible(false);
        G.setVisible(false);
        H.setVisible(false);
        I.setVisible(false);
        J.setVisible(false);
        K.setVisible(false);
        L.setVisible(false);
        M.setVisible(false);
        N.setVisible(false);
        O.setVisible(false);
        P.setVisible(false);
        Q.setVisible(false);
        R.setVisible(false);
        S.setVisible(false);
        T.setVisible(false);
        U.setVisible(false);
        V.setVisible(false);
        W.setVisible(false);
        X.setVisible(false);
        Y.setVisible(false);
        Z.setVisible(false);
        game.drawERASER(gc);
        Grade.setText("");
        country.setVisible(true);
        sport.setVisible(true);
        dish.setVisible(true);
        theme.setText("");
        strword="";
        word.setText("");
        Category.setText("Please choose a theme!");
    }


    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {

        launch(args);
    }
}
