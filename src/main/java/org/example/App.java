package org.example;

import java.io.IOException;
import java.nio.file.*;

public class App {
    
    public static void main(String[] args) throws IOException {
        /*Salida s = new Salida();
        s.escribirTxt();*/

        Path p1 = Paths.get("temario", "textos", "java.txt");
        System.out.print("Ruta: "+p1.toAbsolutePath().toString());

        Path p2 = FileSystems.getDefault().getPath("java", "javanio.txt");
        System.out.print("Ruta 2: "+p2.toAbsolutePath().toString());

        Path p3 = Paths.get(System.getProperty("user.home"), "Documento", "java");
        System.out.print(Paths.get(System.getProperty("user.home")));
        System.out.print(p3.toAbsolutePath().toString());

        Path notas = Paths.get("notas.txt");
        if(Files.exists(notas)){
            //System.out.print("Las notas estan puestas");
            Path bak = Paths.get("backup", "notas.bak");
            Files.createDirectories(bak);
            //Files.createFile(bak);
            Files.copy(notas, bak);

            if(!Files.exist(bakDir)){ //Completar
                Files.createDirectories(bakDir);
            }
        }


        Path bakFile = bakDir.resolve
    }
    
}
