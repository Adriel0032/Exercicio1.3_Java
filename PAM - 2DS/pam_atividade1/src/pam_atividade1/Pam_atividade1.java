/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pam_atividade1;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Pam_atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner v1 = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num1 = v1.nextInt();
        int resultado = 0;
        int i = 1;

        while(i <= num1){
            resultado += i;
            i = i + 1;
            System.out.println(resultado);
        }
              
    }
    
}
