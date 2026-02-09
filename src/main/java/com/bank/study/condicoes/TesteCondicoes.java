package com.bank.study.condicoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteCondicoes {
    public static void main(String[] args) {
        String name;
        int idade;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome:");
        name = leia.next();
        System.out.println("Digite sua idade");
        idade = leia.nextInt();

        if (idade > 18 && idade < 21 ){
            System.out.println(name + " é maior de idade");
        } else if (idade > 21) {
            System.out.println(name + " é Responsável");

        } else{
            System.out.println(name + " é menor de idade");
        }
        switch (idade){
            case 18:
                System.out.println(name + " tem dezoito anos");
                break;
            case 21:
                System.out.println(name + " tem vinte e um anos");
                break;
            default:
                System.out.println(name + " tem idade");
        }
    }
}
