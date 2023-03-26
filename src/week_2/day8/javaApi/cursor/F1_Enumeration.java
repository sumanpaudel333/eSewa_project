package week_2.day8.javaApi.cursor;

import java.util.Enumeration;
import java.util.Vector;

public class F1_Enumeration {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement(3);
        v.addElement(2);
        v.addElement(1);

        Enumeration e = v.elements();

        while(e.hasMoreElements()){
            Integer i = (Integer)e.nextElement();
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println(v);
    }
}
