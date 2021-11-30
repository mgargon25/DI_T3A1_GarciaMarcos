/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introspeccionmicontrol;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import misControles.MiControl;

/**
 *
 * @author usuario
 */
public class IntrospeccionMiControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiControl micontrol = new MiControl();
        System.out.println("La clase a la que pertenece mi control es: " + micontrol.getClass());
        
        Class c1 = micontrol.getClass();
        
        muestraLosCampos(c1);
        muestraLosConstructores(c1);
        muestraLosMetodos(c1);
        
    }

    private static void muestraLosConstructores(Class c1) {
        Constructor[] constructores = c1.getDeclaredConstructors();
        System.out.print("Los constructores de la clase son: ");
        System.out.print("( ");
        for(Constructor c: constructores){
            String nombre = c.getName();
            System.out.println("  " + Modifier.toString(c.getModifiers()));
            System.out.println("  " + nombre + " (");
            Class[] tipoParams = c.getParameterTypes();
            for (int i = 0; i<tipoParams.length;i++){
                if(i>0) System.out.print(", ");
                System.out.println(tipoParams[i].getName());
            }
            System.out.println(")");
        }
    }

    private static void muestraLosMetodos(Class c1) {
        
    } 

    private static void muestraLosCampos(Class c1) {
        Field[] campos = c1.getDeclaredFields();
    
        System.out.println("Los campos de la clase son: ");
        for(Field c: campos){
            String nombre = c.getName();
            System.out.println("  " + Modifier.toString(c.getModifiers()));
            System.out.println("  " + nombre + " (");
        }
    }
}
