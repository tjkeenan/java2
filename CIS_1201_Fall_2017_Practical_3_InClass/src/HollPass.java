/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author scourtney
 */
public class HollPass {
    
    public static boolean validate(int hollPassNumber){
        /*
        boolean isValid = false;
        if(hollPassNumber % 13 == 0){
            isValid = true;
        }
        return isValid;
*/
        //this will return false if not evenly divisible by 13 and true if it is.
        return (hollPassNumber % 13 == 0);
    
    }
    
}
