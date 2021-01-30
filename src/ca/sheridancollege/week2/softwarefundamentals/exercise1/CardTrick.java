/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Yahya Al Chaar   
 * Student Number: 991574875
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            int randomCardNumber = (int)Math.floor(Math.random()*13) + 1; 
            c.setValue(randomCardNumber);
            
            int randomSuits = (int)Math.floor(Math.random()*3);
            c.setSuit(Card.SUITS[randomSuits]);
            
            magicHand[i] = c;
            
        }
        
        Scanner scanner = new Scanner(System.in);
 
        try {
            System.out.print("Enter card number (1-13): ");
            int input = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter card Suit  (1: Hearts,  2: Diamonds,  3: Spades,  4: Clubs): "); 
            int inputSuit = Integer.parseInt(scanner.nextLine());
            
            if((inputSuit > 0) && (inputSuit < 5)){
                String SuitName = Card.SUITS[(inputSuit-1)];

                boolean cardFound = false;
                for (int i=0; i<magicHand.length; i++)
                {
                    if((magicHand[i].getValue() == input) && (magicHand[i].getSuit() == SuitName))
                    {
                        cardFound = true; 
                    } 
                }
 
                System.out.println();
                if (cardFound)
                {
                    System.out.println("You Won, You have entered the right Number!");
                }
                else
                {
                    System.out.println("Sorry, You Lost. You have entered a card that was not picked by the game.");
                    System.out.println("You Entered Card Number: " + input + " Suit of " + SuitName);
                }
                
                
                
            }
            else
            {
                System.out.println("You have entered an invalid Suit Number!");
            }
            
        } catch (Exception e) {
            System.out.println("You have entered an invalid input!");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
