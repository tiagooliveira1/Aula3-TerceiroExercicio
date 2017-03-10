package com.tiago;

import com.opet.util.Reader;

public class Aula3Terceiro
{

    public static void main(String[] args) throws Exception
    {
        System.out.print("Informe um número:");
        double numero = Reader.readDouble();

        if( ((numero % 10)==0) && (numero % 5==0) && (numero % 2)==0) {
            System.out.print("Seu número atende:");
        }

    }

}
