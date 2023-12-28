package com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie.controller;

import com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie.service.BruteForceService;
import com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie.service.DecryptService;
import com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie.service.EncryptService;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

public class EncryptController {
    EncryptService encryptService;
    DecryptService decryptService;
    BruteForceService bruteForceService;
    static File file;
    @FXML
    TextField insertKeyField;
    // ВЫБРАТЬ ФАЙЛ
    @FXML
    protected void onChooseFileButtonClick() {
        FileChooser fileChooser = new FileChooser();
        file = fileChooser.showOpenDialog(null);
    }

    // ЗАШИФРОВАТЬ Ave, Caesar!
    @FXML
    protected void onDoEncryptButtonClick() throws IOException {
        encryptService = new EncryptService();
        encryptService.doEncrypt(file);
    }
}
