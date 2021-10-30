module com.kodilla.blackjack.blackjack {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kodilla.blackjack.blackjack to javafx.fxml;
    exports com.kodilla.blackjack.blackjack;
}