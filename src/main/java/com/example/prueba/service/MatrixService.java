package com.example.prueba.service;

import com.example.prueba.Models.*;
import org.springframework.stereotype.Service;

@Service
public class MatrixService {

   private char[][]matrix;
    private int start_row;
    private int start_col;

   public SopaResponse buscarPlabra(SopaRequest sopaRequest){

       SopaResponse sopaResponse = new SopaResponse();
        char[][] datos = construirMatrix(sopaRequest.getSearchword(),sopaRequest.getRows());
        //usar funcion opendiente
       boolean estado = search(datos, sopaRequest.getWord());

       sopaResponse.setSearchword(sopaRequest.getSearchword());
       sopaResponse.setRows(sopaRequest.getRows());
       sopaResponse.setWord(sopaRequest.getWord());
       sopaResponse.setContains(estado);
        sopaResponse.setStart_row(start_row); //variables a llenar con la fun buscar
        sopaResponse.setStart_col(start_col);

       return sopaResponse;
   }

   public char[][] construirMatrix(String searchword, int rows){

       int numberColumns = searchword.length()/rows;
       char[][] abecedarioMatrix= new char[rows][numberColumns];
       int count = 0;


      for (int i = 0; i < rows; i++) {
               for (int j = 0; j < numberColumns; j++){
                   abecedarioMatrix[i][j] = searchword.charAt(count);
                           count++;
                   System.out.print(abecedarioMatrix[i][j]);
               }

          System.out.println();
               }
      return abecedarioMatrix;
   }

    public static boolean search(char[][]matrix, String word) {
//codigo a buscar
        int start_row;
        int start_col;


        char[] charArray = word.toCharArray();
        char letra;
        for (int i = 0; i < charArray.length; i++) {
            letra = charArray[i];
        }
        char[][] comparacion = new char[0][0];
//si la letra en x posiicon de la matriz es igual a la posicion de palabra
          /*  if (charArray[i] == comparacion[i][0]){
                System.out.println(letra);*/
        for (int fila = 0; fila < matrix.length; fila++) {
            for (int column = 0; column < charArray.length; column++) {
                for (int recorrer = 0; recorrer < charArray.length; recorrer++) {
                    if (charArray[recorrer] == matrix[fila][column]) {
                        comparacion[fila][column] = 1;

                    }                    return true;
                    //guardar indice para inici y fin de la palabra cuando coincidan
                }
            }
        }
        return false;

    }
}
