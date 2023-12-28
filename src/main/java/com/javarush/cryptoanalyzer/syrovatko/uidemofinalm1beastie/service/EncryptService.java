package com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie.service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptService {

    public void doEncrypt(File file) throws IOException {
        
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[(int) file.length()]; // КУДА ЗАПИШЕТСЯ СОДЕРЖИМОЕ ВЫЧИТАННОГО ФАЙЛА
        fileReader.read(chars);

        // ЛОГИКА ШИФРОВАНИЯ

        FileWriter fileWriter = new FileWriter("result.txt");
        for (int i = 0; i < chars.length; i++) {
            fileWriter.write(chars[i]);
        }
        fileWriter.close();

    }

}
