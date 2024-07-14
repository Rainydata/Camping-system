/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author benav
 */
public class client {
    
    private String nameClient;
    private int telClient;
    private int ageClient;
    
    
    public client(){
        
    }
    
    public client(String nameClient, int telClient, int ageClient){
        this.nameClient = nameClient;
        this.telClient = telClient;
        this.ageClient = ageClient;
    }

    /**
     * @return the nameClient
     */
    public String getNameClient() {
        return nameClient;
    }

    /**
     * @param nameClient the nameClient to set
     */
    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    /**
     * @return the telClient
     */
    public int getTelClient() {
        return telClient;
    }

    /**
     * @param telClient the telClient to set
     */
    public void setTelClient(int telClient) {
        this.telClient = telClient;
    }

    /**
     * @return the ageClient
     */
    public int getAgeClient() {
        return ageClient;
    }

    /**
     * @param ageClient the ageClient to set
     */
    public void setAgeClient(int ageClient) {
        this.ageClient = ageClient;
    }
    
    
}
