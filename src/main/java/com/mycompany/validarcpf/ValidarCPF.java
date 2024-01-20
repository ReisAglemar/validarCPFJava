/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.validarcpf;

import java.util.Scanner;

/**
 *
 * @author reis
 */
public class ValidarCPF {

    public static void main(String[] args) {

        boolean cpfValido = false;
        //saida do progrma, quando cpf for válido a saida será true.
        String cpf;
        //entrada do programa
        boolean primeiroVerificador = false;
        //teste do primeiro digito verificador
        boolean segundoVerificador = false;
        //teste do segundo digito verificador
        int digitosCPF = 11;
        int baseMultiplicacao = 10;
        int somaDigitosCpf = 0;
        int[] cpfVetor = new int[digitosCPF];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o CPF.");
        cpf = entrada.next();

        while ((cpf.length() != digitosCPF)
                || (cpf.equals("00000000000")) || (cpf.equals("11111111111"))
                || (cpf.equals("22222222222")) || (cpf.equals("33333333333"))
                || (cpf.equals("44444444444")) || (cpf.equals("55555555555"))
                || (cpf.equals("66666666666")) || (cpf.equals("77777777777"))
                || (cpf.equals("88888888888")) || (cpf.equals("99999999999"))) {
            
            System.out.println("O CPF inserido possuí erros, não há 11 "
                    + "dígitos ou os 11 dígitos são iguais.");
            System.out.println("Vamos tentar novamente. Insira apenas os "
                    + "números do CPF.");
            cpf = entrada.next();
        }
        
        System.out.println("");
        System.out.println("CPF informado: " +cpf);
        System.out.println("");

        for (int i = 0; i < digitosCPF; i++) {
            cpfVetor[i] = Integer.parseInt(String.valueOf((cpf.charAt(i))));
            // converteu uma String para um vetor de inteiros
            if (i < 9) {
                somaDigitosCpf += (cpfVetor[i] * baseMultiplicacao);
                baseMultiplicacao--;
            }
        }

        if (digitosCPF - (somaDigitosCpf % digitosCPF) == cpfVetor[9]) {
            primeiroVerificador = true;
        } else {
            System.out.println("");
            System.out.println("LOG DE ERRO: Primeiro dígito verificador não corresponde!!! " + cpfVetor[9]
                    + " É diferente de " + (digitosCPF - (somaDigitosCpf % digitosCPF)) + ".");            
        }
        
        baseMultiplicacao = 11;
        somaDigitosCpf = 0;

        for (int i = 0; i < digitosCPF; i++) {
            if (i < 10) {
                somaDigitosCpf += (cpfVetor[i] * baseMultiplicacao);
                baseMultiplicacao--;
            } else {
                break;
            }
        }

        if (digitosCPF - (somaDigitosCpf % digitosCPF) == cpfVetor[10]) {
            segundoVerificador = true;
        } else {
            System.out.println("LOG DE ERRO: Segundo dígito verificador não corresponde!!! " + cpfVetor[10]
                    + " É diferente de " + (digitosCPF - (somaDigitosCpf % digitosCPF)) + ".");
            System.out.println("");
        }

        if (primeiroVerificador == true && segundoVerificador == true){
            cpfValido = true;
            System.out.println("");
            System.out.println("CPF informado é válido.");
        } else {
            System.out.println("O CPF é inválido. Verifique os log's de erro acima.");
        }
    }
}
