package com.mycompany.atividade_4_artur_costa_tourinho;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class CocktailSort{
    static int temp;   
static void Cocktail(int a[], int n){  
    boolean mistura = true;  
    int inicio = 0;
    int i;  
    int fim = n - 1;  
   
    while (mistura) {  
            mistura = false;  
        for (i = inicio; i < fim; ++i) {  
            if (a[i] > a[i + 1]){  
                temp = a[i];  
                a[i]=a[i+1];  
                a[i+1]=temp;                  
                mistura = true;  
            }  
        }  
        if (!mistura)  
           break;  
        mistura = false;  
        for (i = fim - 1; i >= inicio; --i) {  
            if (a[i] > a[i + 1]){  
                temp = a[i];  
                a[i]=a[i+1];  
                a[i+1]=temp;  
                mistura = true;  
            }  
        }  
               inicio++;  
    }  
}  

}