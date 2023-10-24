package ru.netology.web.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.web.data.DataHelper;
import ru.netology.web.data.SQLHelper;
import ru.netology.web.page.PaymentPage;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebitTest {
    PaymentPage paymentPage;

    @BeforeEach
    void setUp() {
        paymentPage = open("http://localhost:8080", PaymentPage.class);
    }

    @Test
    void shouldSuccessPayment() {
        var cardInfo = new DataHelper().getValidCardInfo("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.verifySuccessMessage();
        assertEquals ("APPROVED", new SQLHelper().getDebitStatus());
    }

    @Test
    void shouldNotPayWithEmptyCardNumber() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithEmptyCardNumber();
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.verifySuccessMessage();
    }
}
