/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author benav
 */
public class tent {
 
    private String numId;
    private String typeTent;
    private int capacity;
    private String key;
    private boolean isfree;
    
    
    public tent(){
        
    }
    
   public tent (String numId, String typeTent, int capacity, String key){
    this.numId = numId;
    this.typeTent = typeTent;
    this.capacity = capacity;
    this.key = key;
    this.isfree = true;
}

    /**
     * @return the numId
     */
    public String getNumId() {
        return numId;
    }

    /**
     * @param numId the numId to set
     */
    public void setNumId(String numId) {
        this.numId = numId;
    }

    /**
     * @return the typeTent
     */
    public String getTypeTent() {
        return typeTent;
    }

    /**
     * @param typeTent the typeTent to set
     */
    public void setTypeTent(String typeTent) {
        this.typeTent = typeTent;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return the isfree
     */
    public boolean isIsfree() {
        return isfree;
    }

    /**
     * @param isfree the isfree to set
     */
    public void setIsfree(boolean isfree) {
        this.isfree = isfree;
    }

}

