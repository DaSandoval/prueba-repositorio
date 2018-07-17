package com.fundation.search.util;

import java.io.File;
import java.util.regex.Pattern;

public class Validator {
    public boolean isToPath(String isPath) {
        File file = new File(isPath);
        return file.isAbsolute() && file.isDirectory();
    }

    public boolean isToFile(String fileExist) {
        File file = new File(fileExist);
        if (file.exists()) {
            System.out.println(fileExist);
            return true;
        } else {
            return false;
        }
    }

    public boolean isFileOfAudio(String typeOfFile, String extend) {
        String[] formato = typeOfFile.split(Pattern.quote("."));
        for (int i = 0; i < formato.length; i++)
            if (formato[i].equalsIgnoreCase(extend)) {
                return true;
            }
        return false;
    }

    public boolean isNumberValid(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
}

