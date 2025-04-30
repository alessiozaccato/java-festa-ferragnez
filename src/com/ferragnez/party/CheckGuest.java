package com.ferragnez.party;

import java.util.Scanner;

// Nel programma occorre:
// - creare e inizializzare l’array contenente i nomi degli invitati
// - chiedere all’utente come si chiama
// - verificare che il nome sia presente nella lista
// - lasciarlo entrare o rispedirlo cortesemente da dove è venuto

// Bonus
// se avete usato il ciclo for per cercare il nome nella lista nella consegna base, 
// implementare lo stesso programma usando il ciclo while, e viceversa

public class CheckGuest {
    public static void main(String[] args) {

        // let's intiatialize the array of guests
        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // preparing the scanner to use
        Scanner sc = new Scanner(System.in);

        String inputGuest;

        boolean isGuestHere = false;

        System.out.println("inserisci il tuo nome");

        inputGuest = sc.nextLine();

        for (int i = 0; i < guests.length; i++) {
            if (inputGuest.toLowerCase().trim().equals(guests[i].toLowerCase().trim())) {
                isGuestHere = true;
                break;
            }
        }

        if (isGuestHere) {
            System.out.println("complimenti hai passato i controlli di sicurezza, entra pure!");
        } else {
            System.out.println("malissimo sembra che tu non sia stato invitato, via di qui!!!");

        }

        // per andare a terminare lo scanner utilizzato
        sc.close();

    }
}
