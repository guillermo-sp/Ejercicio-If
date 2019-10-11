/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuberiasif;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class TuberiasIf {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * System.out.println("Mete un numero"); int numero=teclado.nextInt();
         * String saludo;
         *
         * if(numero>=0){ saludo="El numero es positivo"; } else{ saludo="El
         * numero es negativo"; }
        System.out.println(saludo);
         */
        System.out.println("Introduce tu nota y te dire lo que tienes");
        double nota = teclado.nextDouble();
        String resultado;

        if (nota <= 5) {
            resultado = "Suspenso";
        } else if (nota >= 5 && nota < 7) {
            resultado = "aprobado";

        } else if (nota >= 7 && nota < 9) {
            resultado = "notable";
        } else if (nota >= 9 && nota < 10) {
            resultado = "sobresaliente";
        } else if(nota==10) {
            resultado = "MATRICULA";
        }   else {
            resultado="La nota no es valida";
        }
            
        
        System.out.println(resultado);
    }}
