/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 *
 * @author Anurag Kolluru
 * 
 */
public class AquaticAnimal extends Animal{

    public AquaticAnimal(String name) {
        super(name);
    }

    @Override
    public void setGender(AnimalGender gender) {
        super.setGender(gender); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AnimalGender getGender() {
        return super.getGender(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void speak() {
      
    }
    
    @Override
    public void move() {
      
    }
    
}
