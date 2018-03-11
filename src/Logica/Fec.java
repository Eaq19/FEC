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
    private String[] aEcuacion = null;

    public Fec(int iElement, int iSalidas, int iXOR, String[] aEcuacion) {
        //Variables inicializadas
        this.iElement = iElement;
        this.iSalidas = iSalidas;
        this.aEcuacion = aEcuacion;
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
            int iAuxSalidas = 0;
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
                    iTabla[i][j] = this.getSalida(iAuxSalidas, iTabla, i);
                    iAuxSalidas++;
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
    
    public int getSalida(int iAuxSalidas, int[][] iTabla, int iRow) {
        int iValor = 0;
        String[] sPartes = this.aEcuacion[iAuxSalidas].split(" XOR ");
        if (sPartes.length == 1) {
            iValor = this.getValorElemento(sPartes[0], iTabla, iRow);
        } else{
            int iAnterior = -1;
            int iAux = 0;
            for (int i = 1; i < sPartes.length; i++) {
                if (iAnterior == -1) {
                    iAnterior = this.getValorElemento(sPartes[i - 1], iTabla, iRow);
                }
                System.out.println("Anterior " + iAnterior);
                System.out.println("Actual " + this.getValorElemento(sPartes[i], iTabla, iRow));
                iAux = this.getXOR(iAnterior, this.getValorElemento(sPartes[i], iTabla, iRow));
                iAnterior = iAux;
            }
            iValor = iAnterior;
            System.out.println("Resultado " + iValor);
        }
        return iValor;
    }
    
    public int getXOR(int iAnterior, int iActual) {
        int iValor = 0;
        if (iAnterior != iActual) {
            iValor = 1;
        }
        return iValor;
    }
    
    public int getValorElemento(String sElemento, int[][] iTabla, int iRow) {
        int iValor = 0;
        if (sElemento.equals("E")) {
            iValor = iTabla[iRow][0];
        } else {
            for (int i = 0; i < this.iElement; i++) {
                String sText = "D" + (i+1);
                if (sText.equals(sElemento)) {
                    iValor = iTabla[iRow][i + 1];
                    return iValor;
                }
            }
        }
        return iValor;
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
