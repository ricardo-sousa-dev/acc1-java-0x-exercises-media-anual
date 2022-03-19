package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/** Método inicial. */
public class Main {
  /** Método inicial. */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    try {
      System.out.println("\n");
      System.out.println("Qual é o seu nome?");
      String nome = scan.next();
      System.out.println("\n");

      System.out.println("Entre com as notas das avaliações:");
      System.out.println("Avaliação 1: ");
      double av1 = scan.nextDouble();
      // String av1Scan = scan.next();
      System.out.println("\n");

      System.out.println("Avaliação 2: ");
      double av2 = scan.nextDouble();
      // String av2Scan = scan.next();
      System.out.println("\n");

      System.out.println("Avaliação 3: ");
      double av3 = scan.nextDouble();
      // String av3Scan = scan.next();
      System.out.println("\n");

      System.out.println("Avaliação 4: ");
      double av4 = scan.nextDouble();
      // String av4Scan = scan.next();
      System.out.println("\n");

      Nota nota = new Nota();
      double media = nota.calcularMedia(av1, av2, av3, av4);
      System.out.println("Olá " + nome + ", sua média é " + media);

      scan.close();

    } catch (Exception e) {
      System.out.println("\n");
      System.out.println("Erro: " + e.getMessage());
    }
  }
}
