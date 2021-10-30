module com.kodilla.blackjack.blackjack {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.kodilla.blackjack.blackjack to javafx.fxml;
    exports com.kodilla.blackjack.blackjack;
}