/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vapecalculator;

import org.json.JSONException;
import org.json.JSONObject;

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
    public void showBattery () throws JSONException{
        JSONObject obj = new JSONObject();
        obj.put(" Company Name : ",getCompanyName());
        obj.put(" Battery Model : ",getBatteryModel());
        obj.put(" Max Amp : ", getMaxAmp());
        obj.put(" Volt : ", getVolt());
        System.out.println(obj);
    }
}
