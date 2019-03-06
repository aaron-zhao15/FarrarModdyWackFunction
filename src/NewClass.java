/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author XingLu
 */
public class NewClass {
    public static void main( String args[] )
	{
            for(int i = 0; i <=1000; i=i+1){
                
                System.out.println(i + ": "  + ": " + function2(i));
            }
            
	}
    
    

    
    public static ArrayList<Double> function2(int in){
        double count = 0;
        ArrayList<Double> arr = new ArrayList<Double>();
        for(double i = 1; i <= in; i++){
                if((i*i)%in == 7){
                    count++;
                    arr.add(i);
                }
            }
        return arr;
    }
    public static double function1(int in){
        double count = 0;
        for(double i = 1; i <= in; i++){
                if((i*i)%in == 7){
                    count++;
                }
            }
        return count;
    }
}
