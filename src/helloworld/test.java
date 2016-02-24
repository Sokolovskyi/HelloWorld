/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import com.pi4j.component.servo.ServoDriver;
import com.pi4j.component.servo.ServoProvider;
import com.pi4j.component.servo.impl.RPIServoBlasterProvider;
import java.io.IOException;

/**
 *
 * @author osokolovskyi
 */
public class test {
    
    

   
    public static void main(String[] args) throws Exception {
    
    ServoProvider servoProvider = new RPIServoBlasterProvider();
    ServoDriver servo7 = servoProvider.getServoDriver(servoProvider.getDefinedServoPins().get(7));
     
    System.out.println("actual pulse 1 " + Integer.toString(servo7.getServoPulseWidth()));
    servo7.setServoPulseWidth(20);
    System.out.println("actual pulse 2 " + Integer.toString(servo7.getServoPulseWidth()));
    }

}



    
