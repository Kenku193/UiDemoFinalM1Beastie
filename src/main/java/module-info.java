module com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie to javafx.fxml;
    exports com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie;
    exports com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie.controller;
    opens com.javarush.cryptoanalyzer.syrovatko.uidemofinalm1beastie.controller to javafx.fxml;
}