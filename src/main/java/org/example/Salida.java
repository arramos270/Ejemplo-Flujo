package org.example;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

public class Salida {

    public void escribir() { // Asi, podemos hacer lo que queramos y coger las excepciones al vuelo, sin necesidad del bloque final

        try (BufferedOutputStream bos =
                     new BufferedOutputStream(
                             new FileOutputStream("numeros.dat"))) {

            for (int i = 0; i < 100; i++) {
                bos.write(ThreadLocalRandom.current().nextInt());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*public void escribirTxt() {

        /*try (OutputStreamWriter bos =
                     new OutputStreamWriter(
                             new FileOutputStream("texto.txt"))) {

            for (int i = 0; i < 100; i++) {
                bos.write("Era un domingo en la tarde con los coches de choque");
                //bos.write("a");
            } //Usaremos OutputStreamWriter cuando queramos escribir texto en un flujo binario, pues une ambos flujos

        try(){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
