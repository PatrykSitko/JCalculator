module be.sitkopatryk.calculator {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports be.sitkopatryk.calculator;
    exports be.sitkopatryk.calculator.controller;

    opens be.sitkopatryk.calculator.controller;
}
