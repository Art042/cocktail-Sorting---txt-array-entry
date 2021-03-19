package com.mycompany.atividade_4_artur_costa_tourinho;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
   
        Scanner ler = new Scanner(System.in);
        //File arquivo = new File("C:\\Users\\artur\\Desktop\\teste.txt");
        System.out.println("Digite o nome do arquivo:");
        String nome = ler.nextLine();
        ArrayList linhaF = new ArrayList<String>();
        
        File arquivo = new File(nome);
        
        System.out.println("Digite o delimitador: \nExemplo: [;] [\\n] [,] [.] ");
        String delim = ler.nextLine();
        
        FileReader ler_arquivo = new FileReader(arquivo);
        BufferedReader buff_arq = new BufferedReader(ler_arquivo);
        String texto = buff_arq.readLine(); //lê uma linha do arquivo
        
        int tamanho = texto.length();
        String exibir;
        while(buff_arq.ready()){
            exibir = buff_arq.readLine();
            //System.out.println(exibir);//Exibir conteúdo não processado txt.
        }
        int j = 0;
        while(texto != null){
            linhaF.addAll(Arrays.asList(texto.split(delim))); 
            
            texto = buff_arq.readLine();
            buff_arq.close();
        }
        String[] array = (String[]) linhaF.toArray(new String[tamanho]);
        
        int[] array_int = new int[tamanho];      
        int tamanho_array = 0;
        for(int i=0;i<tamanho;i++){ 
            if(array[i] != null)
                tamanho_array++;        
        }

        System.out.println("\nArray Desordenado: ");
        for(int i = 0; i<tamanho_array; i++){
            System.out.print(" "+array[i]);
        }
        for(int i = 0; i < tamanho_array; i++) {
                array_int[i] = Integer.parseInt(array[i]);
        }
            System.out.println("\nQual busca deseja:\n[1] QuickSort\n[2] HeapSorting\n[3] CocktailSort");
            int resposta = ler.nextInt();        
            if(resposta == 1){
                QuickSort.quickSort(array_int, array_int[0], tamanho_array);
                System.out.println("\nArray Ordenado: ");
                for(int i = 0; i<tamanho_array; i++){
                    System.out.print(" "+array_int[i]);
                }
            }
            if(resposta == 2){
                HeapSorting.heapSort(array_int, tamanho_array);
                System.out.println("\nArray Ordenado: ");
                for(int i = 0; i<tamanho_array; i++){
                    System.out.print(" "+array_int[i]);
                }
            }
            if(resposta == 3){
                CocktailSort.Cocktail(array_int, tamanho_array);
                System.out.println("\nArray Ordenado: ");
                for(int i = 0; i<tamanho_array; i++){
                    System.out.print(" "+array_int[i]);
                }
            }        
    }
}
    