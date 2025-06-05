/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package culminating;

import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author 342353125
 */
public class Person {
    private int x, y;
    private String name;
    private int age;
    private PApplet app;
    private PImage image;
    
    public Person(PApplet p, int x, int y, String name, int age, String imagePath){
        this.app = p;
        this.x = x;
        this.y = y;
        this.name = name;
        this.age = age;
        this.image = app.loadImage(imagePath);
    }
    
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    public void draw(){
        app.load(image, x, y);
    }
}
