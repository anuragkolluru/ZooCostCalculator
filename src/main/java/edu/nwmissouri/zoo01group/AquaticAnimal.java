/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This class gives information about Aquatic animal (fish,frog,whale)
 *
 * @author Anurag Kolluru
 */
public class AquaticAnimal extends Animal {

    /**
     *
     */
    public double distance;
    public boolean isDangerous;
    private double waterDepth_meters;
    private int watchTime;
    private double y=9.8;
    private int g;

    /**
     *
     * @return 
     */
    @Override
    public String speak() {
        return "Generic speak method";

    }

    /**
     *
     * @return 
     */
    @Override
    public String move() {
        return "Generic move method";
    }

    /**
     * This is a constructor
     * @param distance
     * @param isDangerous
     * @param waterDepth_meters
     * @param watchTime
     * @param name
     */
    public AquaticAnimal(double distance, boolean isDangerous, double waterDepth_meters, int watchTime, String name) {
        super(name);
        this.distance = distance;
        this.isDangerous = isDangerous;
        this.waterDepth_meters = waterDepth_meters;
        this.watchTime = watchTime;
    }

    /**
     * This method returns depth of the water
     *
     * @return waterDepth_meters
     */
    public double getWaterDepth_meters() {
        return waterDepth_meters;
    }

    /**
     * This method returns the watch time
     *
     * @return watchTime
     */
    public int getWatchTime() {
        try{
        return watchTime;
       
        }
        catch(Exception exc){
        throw exc;
        }
        
        
    }

    /**
     * This method sets the depth of the water
     *
     * @param waterDepth_meters
     */
    public void setWaterDepth_meters(double waterDepth_meters) {
        this.waterDepth_meters = waterDepth_meters;
    }

    /**
     * This method sets the watch time
     *
     * @param watchTime
     */
    public void setWatchTime(int watchTime) {
        this.watchTime = watchTime;
    }
    public  void Casting()
    {
        g=(int) y;
        System.out.println("casting double to int: "+g);
       
            }
    public  void Exceptions()
    {
        try {
      int[] n = {1, 2, 3,4};
      System.out.println(n[10]);
    }
        catch (Exception E) 
        {
      System.out.println("The exception is about"+E);
      
    }
    }
    
    public static void main(String[] args){
    
    AquaticAnimal a = new AquaticAnimal(12,true,11.3,3,"AquaticAnimal");
        a.Casting();
        a.Exceptions();
    }

}
    /*public static void main(String[] args){
        AquaticAnimal a = new AquaticAnimal(12,true,11.3,3,"AquaticAnimal");
        a.Casting();
        */
            


