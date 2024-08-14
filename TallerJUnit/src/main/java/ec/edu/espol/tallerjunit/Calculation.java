/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerjunit;

/**
 *
 * @author angelozurita
 */
public class Calculation {
    
    public static int findMax(int arr[]) {
        int max = arr[0]; 
        for(int i = 1; i < arr.length; i++) { 
            if(max < arr[i]) { 
                max = arr[i]; 
            }
        }
        return max; 
    }
}

