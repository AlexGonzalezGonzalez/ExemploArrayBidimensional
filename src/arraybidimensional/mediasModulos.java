/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraybidimensional;

import javax.swing.JOptionPane;



 
public class mediasModulos {
int[][] notas = new int[4][3];
    
    int[] medias = new int[notas.length];

    public void crearTaboa() {
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[c].length; c++) {
                notas[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca nota"));
            }
        }

    }

    public void amosar() {
        for (int f = 0; f < notas.length; f++) {

            for (int c = 0; c < notas[c].length; c++) {
                System.out.print(notas[f][c] + " ");
            }
            System.out.println("\n");
        }

    }

    public void mediaAlumno() {
        int acumulador = 0, c, f, media;
        for (f = 0; f < notas.length; f++) {

            for (c = 0; c < notas[c].length; c++) {

                System.out.print(notas[f][c] + " ");
                acumulador = acumulador + notas[f][c];

            }
            System.out.println("suma :" + acumulador);
            media = acumulador / notas[f].length;
            System.out.println("media : " + media);
            acumulador = 0;
            System.out.println("\n");
        }
    }

    public int[] mediaAlumno2() {
        int acumulador = 0, c, f, media;

        for (f = 0; f < notas.length; f++) {

            for (c = 0; c < notas[c].length; c++) {

                System.out.print(notas[f][c] + " ");
                acumulador = acumulador + notas[f][c];

            }
            System.out.println(" ");
            media = acumulador / notas[f].length;
            medias[f] = media;
            acumulador = 0;
            System.out.print("\n" + media);

        }
        return medias;
    }

    public int[] mediaModulos() {
        int acumulador = 0, c, f, media;
        int[] mediasModulos = new int[notas.length];
        for (c = 0; c < notas[0].length; c++) {
            acumulador = 0;

            for (f = 0; f < notas[f].length; f++) {
                System.out.println(notas[f][c]);
                acumulador = acumulador + notas[f][c];

            }

            media = acumulador / notas.length;
            System.out.println("media: " + media);
            mediasModulos[c] = acumulador / notas.length;
        }
        return mediasModulos;
    }

    public void ordenar() {
        int i, j, k, aux1 = 0, aux2 = 0;
        for (i = 0; i < medias.length - 1; i++) {
            for (j = i + 1; j < medias.length; j++) {
                if (medias[i] > medias[j]) {
                    aux1 = medias[i];
                    medias[i] = medias[j];
                    medias[j] = aux1;
                    for (k = 0; k < notas[0].length; k++) {
                        aux2 = notas[i][j];
                        notas[i][k] = notas[j][k];
                        notas[j][k] = aux2;
                    }

                }

            }

        }

    }

    public void amosarTodo() {
        String[] amosarMedias = new String[4];
        
        String[] amosarAlumnos = { "aa" , "bb", "cc", "dd"};
        String[] amosarModulos = { "   ","  PRO  ", "  BD  ", "  CD  "};
        
        int i, j, k;
        for (i = 0; i < amosarModulos.length; i++) {
            System.out.print(amosarModulos[i]);
            
            }
            System.out.println("\n");
            crearTaboa();
           for (j = 0; j < amosarAlumnos.length; j++) {
               System.out.println(amosarAlumnos[j]); 
               System.out.println("");
               for (k = 0; k < notas[k].length; k++) {
                   System.out.print(notas[j][k]+"       ");
                   
                   
               }
            System.out.println("\n");
            
        }
    }
}
