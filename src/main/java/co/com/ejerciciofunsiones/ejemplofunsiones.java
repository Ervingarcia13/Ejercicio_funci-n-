package co.com.ejerciciofunsiones;

import java.security.PublicKey;
import java.util.Scanner;

public class ejemplofunsiones {

     ///  y aca se programa la funsion suma siempre dar el mismo valor que se dejo en la declaracion de las  variables ///
    /// en este caso double ///
    public static double Sumar ( double valor1 , double valor2,double valor3 ) {

        double resultado;
        resultado=valor1+valor2+valor3;
        return resultado ;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner teclado = new Scanner(System.in);

        double valor1;
        double valor2;
        double valor3;
        double resultado;


        System.out.println("Introduce un primer valor");
        valor1=teclado.nextDouble();
        System.out.println(" Introduce un segundo valor" );
        valor2=teclado.nextDouble();
        System.out.println(" Introduce un tercer valor" );
        valor3=teclado.nextDouble();
        // llamo a la funcion en main//
        //  resultado = Sumar  para que se ejecute lo que  hice en la funsion suma //

        resultado = Sumar(valor1,valor2,valor3);

        System.out.println("El resultado de la suma es: " +resultado   );



    }



}
