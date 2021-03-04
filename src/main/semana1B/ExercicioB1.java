package main.semana1B;

/*Author: Aline Marques da Silva*/

import java.io.File;

public class ExercicioB1 {

    public static void main(String[] args) {
        String path = "C:\\";
        File name = new File(path);

        if (name.exists() ) {
            if (name.isDirectory() ) {
                System.out.println("\n\nDirectory contents:\n");

                File [] arquivos = name.listFiles();
                assert arquivos != null;
                for(File directoryName : arquivos)
                    System.out.printf("%s%s\n", directoryName, (directoryName.isDirectory() ? " is a directory" : " is a file"));
            }
        } else {
            System.out.printf("%s %s", path, "does not exist.");
        }
    }
}
