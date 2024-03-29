/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static java.lang.Math.pow;
import java.util.ArrayList;
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
    private String[] aEstados = null;
    private String[][] sSalidas = null;
    private int[][] sEstadoFinal = null;
    private String sEstadosFinales = "";
    private String sCodificado = "";
    private ArrayList<Integer> aListEntrada = new ArrayList<Integer>();
    private String sDecodificacion = "";

    /**
     * Constructor
     *
     * @param iElement
     * @param iSalidas
     * @param iXOR
     * @param aEcuacion
     */
    public Fec(int iElement, int iSalidas, int iXOR, String[] aEcuacion) {
        //Variables inicializadas
        this.iElement = iElement;
        this.iSalidas = iSalidas;
        this.aEcuacion = aEcuacion;
        this.iXOR = iXOR;
        this.iEstados = (int) pow(2, iElement);
    }

    /**
     * Funcion que crea la tabla de verdad
     *
     * @return
     */
    public int[][] getTablaVerdad() {
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
                if (j < (this.iElement + 1)) {
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
                    iTabla[i][j] = this.getSalida(iAuxSalidas, iTabla, i, iAux);
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
        this.getCrearEstados(iQFinal, iTabla);
        return iTabla;
    }

    /**
     * Funcion que crea los estados de la tabla de verdad
     *
     * @param iQFinal
     * @param iTabla
     */
    public void getCrearEstados(int[][] iQFinal, int[][] iTabla) {
        this.aEstados = new String[this.iEstados];
        int[] iValor = new int[this.iEstados];
        for (int i = 0; i < this.iEstados; i++) {
            String sText = "";
            for (int j = 0; j < iQFinal[i].length; j++) {
                sText += Integer.toString(iQFinal[i][j]);
            }
            this.aEstados[i] = sText;
        }
        this.sEstadoFinal = new int[2][this.iEstados];
        this.sSalidas = new String[2][this.iEstados];
        sEstadoFinal = this.getInicializarMatriz(sEstadoFinal);
        int iAux = 0;
        for (int i = 0; i < this.iEstados; i++) {
            for (int k = 0; k < 2; k++) {
                //Entrada
                String sAnterior = "";
                for (int j = 1; j < (this.iElement + 1); j++) {
                    sAnterior += Integer.toString(iTabla[iAux][j]);
                }
                //Siguient
                String sFinal = "";
                for (int j = (this.iElement + 1); j < ((this.iElement * 2) + 1); j++) {
                    sFinal += Integer.toString(iTabla[iAux][j]);
                }
                //Siguient
                String sSalida = "";
                for (int j = ((this.iElement * 2) + 1); j < iTabla[0].length; j++) {
                    sSalida += Integer.toString(iTabla[iAux][j]);
                }
                int iPosicionAnterior = this.getEstadoSalida(sAnterior);
                int iPosicionFinal = this.getEstadoSalida(sFinal);
                this.sEstadoFinal[k][iPosicionAnterior] = iPosicionFinal;
                this.sSalidas[k][iPosicionAnterior] = sSalida;
                iAux++;
            }
        }
    }

    public int getEstadoSalida(String sText) {
        int iPosicion = 0;
        for (int i = 0; i < this.aEstados.length; i++) {
            if (sText.equals(this.aEstados[i])) {
                iPosicion = i;
                break;
            }
        }
        return iPosicion;
    }

    public String[] getEstados() {
        return this.aEstados;
    }

    public int getSalida(int iAuxSalidas, int[][] iTabla, int iRow, int iEntrada) {
        int iValor = 0;
        String[] sPartes = this.aEcuacion[iAuxSalidas].split(" XOR ");
        if (sPartes.length == 1) {
            iValor = this.getValorElemento(sPartes[0], iTabla, iRow, iEntrada);
        } else {
            int iAnterior = -1;
            int iAux = 0;
            for (int i = 1; i < sPartes.length; i++) {
                if (iAnterior == -1) {
                    iAnterior = this.getValorElemento(sPartes[i - 1], iTabla, iRow, iEntrada);
                }
                iAux = this.getXOR(iAnterior, this.getValorElemento(sPartes[i], iTabla, iRow, iEntrada));
                iAnterior = iAux;
            }
            iValor = iAnterior;
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

    public int getValorElemento(String sElemento, int[][] iTabla, int iRow, int iEntrada) {
        int iValor = 0;
        if (sElemento.equals("E")) {
            iValor = iEntrada;
        } else {
            for (int i = 0; i < this.iElement; i++) {
                String sText = "D" + (i + 1);
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

    public String getCodificar(String sEntrada) {
        String sText = "";
        this.sEstadosFinales = "";
        this.sCodificado = "";
        //creo un array char con el string anterior
        char cadChar[] = sEntrada.toCharArray();
        //inicializo varibles a utilizar en el ciclo
        int iAnterior = 0;
        for (int i = 0; i < cadChar.length; i++) {
            sText += this.sSalidas[Integer.parseInt(Character.toString(cadChar[i]))][iAnterior];
            iAnterior = this.sEstadoFinal[Integer.parseInt(Character.toString(cadChar[i]))][iAnterior];
            this.sEstadosFinales += "S" + iAnterior;
        }
        this.sCodificado = sText;
        if (iAnterior != 0) {
            sText += "~";
            this.sEstadosFinales += "~";
            String sAux2 = this.getDevolverse(iAnterior, "");
            sText += sAux2;
            if (sAux2 == "") {
                this.aListEntrada = new ArrayList<Integer>();
                ArrayList<Integer> base = new ArrayList<Integer>();
                base.add(iAnterior);
                base = this.getCaminoInical(iAnterior, base);
                for (int j = 0; j < this.aListEntrada.size(); j++) {
                    sText += this.sSalidas[this.aListEntrada.get(j)][base.get(j)];
                    this.sCodificado += this.sSalidas[this.aListEntrada.get(j)][base.get(j)];
                    this.sEstadosFinales += "S" + this.sEstadoFinal[this.aListEntrada.get(j)][base.get(j)];
                }
            }
        }
        for (int i = 0; i < this.iSalidas; i++) {
            sText += "0";
        }
        this.sEstadosFinales += "S0";
        return sText;
    }

    public String getDevolverse(int iActual, String Text) {
        int iAux = this.sEstadoFinal[0][iActual];
        this.sCodificado += this.sSalidas[0][iActual];
        Text += this.sSalidas[0][iActual];
        this.sEstadosFinales += "S" + iAux;
        if (iAux == 0) {
            return Text;
        } else {
            return this.getDevolverse(iAux, Text);
        }
    }

    public String getsCodificado() {
        return this.sCodificado;
    }

    public String getEstadosFinales() {
        return this.sEstadosFinales;
    }

    private ArrayList<Integer> getCaminoInical(int iAnterior, ArrayList<Integer> aBase) {
        boolean bValidacion = true;
        for (int j = 0; j < aBase.size(); j++) {
            if (aBase.get(j) == 0) {
                bValidacion = false;
            }
        }
        if (bValidacion) {
            for (int i = 0; i < 2; i++) {
                int iEstadoActual = this.sEstadoFinal[i][iAnterior];
                if (iEstadoActual == 0) {
                    aBase.add(iEstadoActual);
                    this.aListEntrada.add(i);
                    return aBase;
                } else {
                    boolean bAux = true;
                    for (int j = 0; j < aBase.size(); j++) {
                        if (aBase.get(j) == iEstadoActual) {
                            bAux = false;
                            break;
                        }
                    }
                    if (bAux) {
                        ArrayList<Integer> aAux = aBase;
                        aAux.add(iEstadoActual);
                        aAux = this.getCaminoInical(iEstadoActual, aBase);
                        if (aAux == aBase) {
                            for (int j = 0; j < aAux.size(); j++) {
                                if (aAux.get(j) == 0) {
                                    this.aListEntrada.add(i);
                                    return aAux;
                                }
                            }
                            aAux = null;
                            continue;
                        } else {
                            for (int j = 0; j < aAux.size(); j++) {
                                if (aAux.get(j) == 0) {
                                    this.aListEntrada.add(i);
                                    return aAux;
                                }
                            }
                        }
                    } else {
                        return aBase;
                    }
                }
            }
        }
        return aBase;
    }

    public String getVitterbi(String sText) {
        /**
         * Inicializar arrays
         */
        int iTam = (sText.length() / this.iSalidas) + 1;
        int[][] iMatPeso = new int[this.iEstados][iTam];
        String[][] sMatEstado = new String[this.iEstados][iTam];
        String[][] sMatEstadoPrev = new String[this.iEstados][iTam];
        for (int i = 0; i < this.iEstados; i++) {
            for (int j = 0; j < iTam; j++) {
                iMatPeso[i][j] = -1;
                sMatEstado[i][j] = "";
                sMatEstadoPrev[i][j] = "";
            }
        }
        iMatPeso[0][0] = 0;
        sMatEstado[0][0] = "0";
        sMatEstadoPrev[0][0] = "0";
        /**
         * Recorrer el diagrama de trellis
         */
        int iAux = 0;
        for (int i = 0; i < iTam; i++) {
            for (int j = 0; j < this.iEstados; j++) {
                if (iMatPeso[j][i] > -1) {
                    if (i == j && j == 0) {
                        iMatPeso[this.sEstadoFinal[0][0]][i + 1] = this.getHamming(sText.substring(i * 2, (i * 2) + 2), this.sSalidas[0][0]);
                        sMatEstado[this.sEstadoFinal[0][0]][i + 1] = "0";
                        sMatEstadoPrev[this.sEstadoFinal[0][0]][i + 1] = j + "";
                        iMatPeso[this.sEstadoFinal[1][0]][i + 1] = this.getHamming(sText.substring(i * 2, (i * 2) + 2), this.sSalidas[1][0]);
                        sMatEstado[this.sEstadoFinal[1][0]][i + 1] = "1";
                        sMatEstadoPrev[this.sEstadoFinal[1][0]][i + 1] = j + "";
                    } else if ((i + 1) < iTam) {
                        iAux = this.getHamming(sText.substring(i * 2, (i * 2) + 2), this.sSalidas[0][j]) + iMatPeso[j][i];
                        if (iMatPeso[this.sEstadoFinal[0][j]][i + 1] == -1) {
                            iMatPeso[this.sEstadoFinal[0][j]][i + 1] = iAux;
                            sMatEstado[this.sEstadoFinal[0][j]][i + 1] = "0";
                            sMatEstadoPrev[this.sEstadoFinal[0][j]][i + 1] = j + "";
                        } else {
                            if (iAux < iMatPeso[this.sEstadoFinal[0][j]][i + 1]) {
                                iMatPeso[this.sEstadoFinal[0][j]][i + 1] = iAux;
                                sMatEstado[this.sEstadoFinal[0][j]][i + 1] = "0";
                                sMatEstadoPrev[this.sEstadoFinal[0][j]][i + 1] = j + "";
                            }
                        }
                        iAux = this.getHamming(sText.substring(i * 2, (i * 2) + 2), this.sSalidas[1][j]) + iMatPeso[j][i];
                        if (iMatPeso[this.sEstadoFinal[1][j]][i + 1] == -1) {
                            iMatPeso[this.sEstadoFinal[1][j]][i + 1] = iAux;
                            sMatEstado[this.sEstadoFinal[1][j]][i + 1] = "1";
                            sMatEstadoPrev[this.sEstadoFinal[1][j]][i + 1] = j + "";
                        } else {
                            if (iAux < iMatPeso[this.sEstadoFinal[1][j]][i + 1]) {
                                iMatPeso[this.sEstadoFinal[1][j]][i + 1] = iAux;
                                sMatEstado[this.sEstadoFinal[1][j]][i + 1] = "1";
                                sMatEstadoPrev[this.sEstadoFinal[1][j]][i + 1] = j + "";
                            }
                        }
                    }
                }
            }
        }
        //Seleccionar mejor opcion del arbol
        String sMenor = "";
        iAux = 0;
        for (int i = 0; i < this.iEstados; i++) {
            if (i == 0) {
                iAux = iMatPeso[i][iTam - 1];
                sMenor = i + "";
            } else {
                if (iMatPeso[i][iTam - 1] < iAux) {
                    iAux = iMatPeso[i][iTam - 1];
                    sMenor = i + "";
                }
            }
        }
        /**
         * Obtener mejor camino
         */
        int i = iTam;
        String[] sCamino = new String[i];
        while (i != 0) { 
            sCamino[i - 1] = sMenor;
            sMenor = sMatEstadoPrev[Integer.parseInt(sMenor)][i - 1];
            i = i - 1;
        }
        String sTextCorreccion = "";
        this.sDecodificacion = "";
        int iAuxBits = iTam / 8;
        for (int j = 1; j < sCamino.length; j++) {  
            int iAux2 = Integer.parseInt(sMatEstadoPrev[Integer.parseInt(sCamino[j])][j]);
            int iAux3 = Integer.parseInt(sMatEstado[Integer.parseInt(sCamino[j])][j]);
            this.sDecodificacion += iAux3;
            sTextCorreccion += this.sSalidas[iAux3][iAux2];
        }
        this.sDecodificacion = this.sDecodificacion.substring(0, iAuxBits * 8);
        for (int j = 0; j < this.iSalidas; j++) {
            sTextCorreccion += "0";
        }
        return sTextCorreccion;
    }

    private int getHamming(String sTex, String sTex2) {
        int iAux = 0;
        for (int i = 0; i < sTex.length(); i++) {
            if (Integer.parseInt(sTex.substring(i, i + 1)) != Integer.parseInt(sTex2.substring(i, i + 1))) {
                iAux++;
            }
        }
        return iAux;
    }

    public String getsDecodificacion() {
        return sDecodificacion;
    }
    
}
