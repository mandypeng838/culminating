/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package culminating;

import processing.core.PApplet;

/**
 *
 * @author 342353125
 */
public class Sketch extends PApplet {
    private Person person;
    
    public void settings() {
        size (800, 800);
        person = new Person(this, 200, 200, "Sun Wukong", 0, "images/wukongsprite.png");
    }
    
    public void setup() {
        background(255,255,255);
        person.draw();
    }
}
