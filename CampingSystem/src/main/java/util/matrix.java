/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;
import model.tent;
/**
 *
 * @author benav
 */
public class matrix {
    

    tent[][] matrix;
    
    public matrix (){
        this.matrix = new tent [3][60];
    
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
            matrix[i][j] = new tent();
        }
        }
    }
    
    //method to set a tent the occupied state
    public void setTentOccupied(int row, int column){
       
      if(row >= 0 && row < 3 && column >= 0 && column <6){
        matrix [row][column].setIsfree(false);
      } else{
          matrix[row][column].setIsfree(true);
      }  
        
    }
    //method to know if the tent is occupied
    
    public boolean isTentFree(int row, int column){
        if(row >= 0 && row < 3 && column >= 0 && column <6){
            matrix [row][column].isIsfree();
            return true;
        }else{
            return false;    
        }
    }
    
}
