package edu.eci.cvds.servlet;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "calculadoraBean")
@ApplicationScoped

public class CalculadoraBean {

    private float mean, mode, standardDeviation, variance;

    public CalculadoraBean() {
    }

    public float calculateMean(){
        return mean;
    }

    public float calculateStandardDeviation(){
        return standardDeviation;
    }

    public float calculateVariance(){
        return variance;
    }

    public float calculateMode(){
        return mode;
    }

    public void restart(){

    }



    public float getMean() { return mean; }

    public void setMean(float mean) { this.mean = mean; }

    public float getMode() { return mode; }

    public void setMode(float mode) { this.mode = mode; }

    public float getStandardDeviation() { return standardDeviation; }

    public void setStandardDeviation(float stantardDeviation) { this.standardDeviation = standardDeviation; }

    public float getVariance() { return variance; }

    public void setVariance(float variance) { this.variance = variance; }

}
