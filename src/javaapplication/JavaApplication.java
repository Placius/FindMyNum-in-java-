/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

import java.util.Random;
/**
 *
 * @author Krystian
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tekst powitalny
        System.out.println("Witaj! Zgadnij moją liczbę z przedziału od 1 do 100!");
        System.out.println("Powodzenia!");
        // liczba, która jest propozycją użytkownika
        int x = 0;
        // aktualny numer próby
        int tries = 1;
        
        Random liczba = new Random();
        // wygenerowanie pseudo losowej liczby z przedziału 1-100
        int y = liczba.nextInt(101);
        
        Scanner scanner = new Scanner(System.in);
        
        while(x != y){
            System.out.println("Próba " + Integer.toString(tries));
            System.out.println("Twój typ: ");
            try {
                    // pobranie liczby od użytkownika
                    String userString = scanner.nextLine();
                    // zamiana pobranej liczby na typ integer(liczbowy)
                    x = Integer.parseInt(userString);
                }
                catch (IllegalArgumentException exception) { 
                    System.out.println("Musisz wprowadzić liczbę!");
                }
            // informacje zwrotne (podpowiedzi)
            if(x < 1 || x > 100){System.out.println("Wprowadź liczbę z przedziału od 1 do 100!");}
            
            else if(x < y){System.out.println("Moja liczba jest większa..."); 
                // zaktualizowanie numeru próby 
                tries++;}
            else if(x > y){System.out.println("Moja liczba jest mniejsza...");
                // zaktualizowanie numeru próby
                tries++;}
            }
        // Wydrukowanie informacji końcowych (liczby prób oraz szukanej liczby)
        System.out.println("Gratulacje, moja liczba to " + Integer.toString(y) + "!");
        System.out.println("Udało Ci się ją odgadnąć w " + Integer.toString(tries) + " próbach.");
        }
        
    }
    
