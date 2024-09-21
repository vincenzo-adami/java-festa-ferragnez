package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
  public static void main(String[] args) {
    String[] guest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
        "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

    Scanner scan = new Scanner(System.in);

    System.out.println("Qual è il tuo nome?");
    String name = scan.nextLine();

    System.out.println("Controllo sulla lista...");

    boolean trovato = false;

    // for (int i = 0; i < guest.length; i++) {
    // if (name.equalsIgnoreCase(guest[i])) {
    // trovato = true;
    // break;
    // }
    // }
    int i = 0;
    while (!trovato && i < guest.length) {
      if (name.equalsIgnoreCase(guest[i])) {
        trovato = true;
      }
      i++;
    }

    if (trovato) {
      System.out.println("Benveut* alla festa " + name + ". Entri pure");
    } else {
      System.out.println("Vada via di qui, subito");
    }
  }
}
