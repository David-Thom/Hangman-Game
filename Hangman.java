import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

import java.util.Random;

public class Hangman {
    private String alph = "ABCDEFGHIJLMNOPKRSTUVQXYZ";
    private int letter=0;
    private String [] countrywords = {"AMERICA", "CANADA", "MEXICO", "NIGERIA"};
    private String [] sportswords = {"BASKETBALL", "SOCCER", "FOOTBALL", "TENNIS"};
    private String [] disheswords = {"HAMBURGER", "PIZZA", "WINGS", "SALAD"};
    private String word="";
    private int lives=6;

    public Hangman(){
    }
    public String getWord(){
        return word;
    }
    public int getLives(){
        return lives;
    }
    public int getLetter(){
        return letter;
    }
    public void decrementlives(){
        lives=lives-1;
    }
    public void IncLetter(){
        letter=letter+1;
    }
    public void SetTheme(String theme){
        int x = (int)(Math.random()*4);
        if(theme.equals("country")){
            word=countrywords[x];
        }
        if(theme.equals("dishes")){
            word=disheswords[x];
        }
        if(theme.equals("sports")){
            word=sportswords[x];
        }

    }

    public void ResetGame(){
        lives=6;
        word="";
        letter=0;

    }
    public void drawMAN(GraphicsContext gc){
        if(lives==5) {
            gc.strokeOval(700, 180, 30, 30);

        }
        if(lives==4){
            gc.strokeRect(715, 227.5, 35, 3);
        }
        if(lives==3){
            gc.strokeRect(680, 227.5, 35, 3);
        }
        if(lives==2){
            gc.strokeRect(715, 280, 35, 3);
        }
        if(lives==1){
            gc.strokeRect(680, 280, 35, 3);

        }
        if(lives==0){
            gc.strokeRect(715, 210, 3, 70);
        }
    }
    public void drawERASER(GraphicsContext gc){
        gc.clearRect(698, 178, 30, 30);
        gc.clearRect(702, 182, 30, 30);

        gc.clearRect(715, 227.5, 35, 3);
        gc.clearRect(713,225.5,35,3);
        gc.clearRect(717,229.5,35,3);

        gc.clearRect(680, 227.5, 35, 3);
        gc.clearRect(682,229.5,35,3);
        gc.clearRect(678,225.5,35,3);

        gc.clearRect(715, 280, 35, 3);
        gc.clearRect(713,278,35,3);
        gc.clearRect(717,282,35,3);

        gc.clearRect(680, 280, 35, 3);
        gc.clearRect(682,282,35,3);
        gc.clearRect(678,278,35,3);

        gc.clearRect(715, 210, 3, 70);
        gc.clearRect(717,212,3,70);
        gc.clearRect(713,208,3,70);

        gc.clearRect(647, 170, 80, 5);
        gc.clearRect(647, 170, 5, 180);

        gc.clearRect(649,172,80,5);
        gc.clearRect(645,168,80,5);

        gc.clearRect(649,172,5,180);
        gc.clearRect(645,168, 5, 180);


    }
    public void drawSTAGE(GraphicsContext gc){
        gc.setFill(Color.BLACK);
        gc.fillRect(647, 170, 80, 5);
        gc.strokeRect(647, 170, 80, 5);
        gc.setFill(Color.BLACK);
        gc.fillRect(647, 170, 5, 180);
        gc.strokeRect(647, 170, 5, 180);
    }

}
