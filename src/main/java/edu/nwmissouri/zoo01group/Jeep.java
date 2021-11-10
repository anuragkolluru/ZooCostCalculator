/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo01group;

/**
 * This is Jeep Class which is extended from FourWheeler Class
 * @author Naveen Kumar Kanaparthi
 */
public class Jeep extends FourWheeler {
    private String engineTypeandRequiredFuel ;
    private double Displacement;
    private String fuelSystem;
    
    public Jeep() {
        super(60,120);
    }
    
    /**
     * 
     * @return engineTypeandRequiredFuel // 
     */

    public String getEngineTypeandRequiredFuel() {
        return engineTypeandRequiredFuel;
    }/**
     * 
     * @param engineTypeandRequiredFuel //
     */

    public void setEngineTypeandRequiredFuel(String engineTypeandRequiredFuel) {
        this.engineTypeandRequiredFuel = engineTypeandRequiredFuel;
    }/**
     * 
     * @return Displacement
     */

    public double getDisplacement() {
        return Displacement;
    }/**
     * 
     * @param Displacement // (litres per cubic inches)
     */

    public void setDisplacement(double Displacement) {
        this.Displacement = Displacement;
    }/**
     * 
     * @return fuelSystem
     */

    public String getFuelSystem() {
        return fuelSystem;
    }/**
     * 
     * @param fuelSystem // kinda fuel system
     */

    public void setFuelSystem(String fuelSystem) {
        this.fuelSystem = fuelSystem;
    }/**
     * 
     * @return maximumHorsePower // maximum horsepower of engine
     */
   public String maxHorsePower(){
       String maximumHorsePower="270@5250";
       return maximumHorsePower;
   }/**
    * 
    * @return maxTorque // maximum torque
    */
   public String maximumTorque(){
       String maxTorque="260@4800";
       return maxTorque;
   }
    
}
