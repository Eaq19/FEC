/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static java.lang.Math.pow;
import java.util.Arrays;

/**
 *
 * @author Acer
 */
public class Fec {
    
    private int iElement = 0;
    private int iSalidas = 0;
    private int iXOR = 0;
    private int iEstados = 0;

    public Fec(int iElement, int iSalidas, int iXOR) {
        //Variables inicializadas
        this.iElement = iElement;
        this.iSalidas = iSalidas;
        this.iXOR = iXOR;
        this.iEstados = (int) pow(2, iElement);
    }
    
    public int[][] getTablaVerdad () {
        int[][] iTabla = new int[this.iEstados * 2][1 + (this.iElement * 2) + this.iSalidas];
        int iAux = 0;
        int[] iQInicial = new int[this.iElement];
        iQInicial = this.getInicializar(iQInicial);
        int[][] iQFinal = new int[this.iEstados * 2][this.iElement];
        iTabla = this.getInicializarMatriz(iTabla);
        iQFinal = this.getInicializarMatriz(iQFinal);
        int iAux2 = 1;
        int iAux3 = 1;
        //Algoritmo para tabla de verdad
        for (int i = 0; i < iTabla.length; i++) {
            if (iAux == 2) {
                iAux = 0;
                iQInicial = iQFinal[iAux3];
                iAux3++;
            }
            int[] iAuxFinal = new int[this.iElement];
            iAuxFinal = this.getInicializar(iAuxFinal);
            for (int j = 1; j < iTabla[i].length; j++) {
                if (j < (this.iElement + 1)){
                    iTabla[i][j] = iQInicial[j - 1];
                } else if (j >= (this.iElement + 1) && j < ((this.iElement * 2) + 1)) {
                    if (j == (this.iElement + 1)) {
                        iTabla[i][j] = iAux;
                        iAuxFinal[j - (this.iElement + 1)] = iAux;
                    } else {
                        iTabla[i][j] = iQInicial[j - (this.iElement + 2)];
                        iAuxFinal[j - (this.iElement + 1)] = iQInicial[j - (this.iElement + 2)];
                    }
                } else {
                    iTabla[i][j] = 0;
                }
            }
            for (int j = 0; j < iQFinal.length; j++) {
                if (!Arrays.equals(iQFinal[j], iAuxFinal)) {
                    iQFinal[iAux2] = iAuxFinal;
                    iAux2++;
                    break;
                }
            }
            iTabla[i][0] = iAux;
            iAux++;
        }
        return iTabla;
    }
    
    public int[] getInicializar(int[] iArray) {
        for (int i = 0; i < iArray.length; i++) {
            iArray[i] = 0;
        }
        return iArray;
    }
    
    public int[][] getInicializarMatriz(int[][] iArray) {
        for (int i = 0; i < iArray.length; i++) {
            for (int j = 0; j < iArray[0].length; j++) {
                iArray[i][j] = 0;
            }
        }
        return iArray;
    }
    
}
