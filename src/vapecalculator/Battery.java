/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vapecalculator;


/**
 *
 * @author PC1
 */
public class Battery {
    private String companyName;
    private String batteryModel;
    private Float maxAmp;
    private Float volt;
    public Battery(){
    }
    public Battery(String companyName, String batteryModel, Float maxAmp, Float volt){
        this.companyName=companyName;
        this.batteryModel=batteryModel;
        this.maxAmp=maxAmp;
        this.volt=volt;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public void setBatteryModel(String batteryModel){
        this.batteryModel = batteryModel;
    }
    public void setMaxAmp(Float maxAmp){
        this.maxAmp = maxAmp;
    }
    public void setVolt (Float volt){
        this.volt = volt;
    }
    public String getCompanyName(){
        return this.companyName;
    }
    public String getBatteryModel(){
        return this.batteryModel;
    }
    public Float getMaxAmp(){
        return this.maxAmp;
    }
    public Float getVolt(){
        return this.volt;
    }
}
