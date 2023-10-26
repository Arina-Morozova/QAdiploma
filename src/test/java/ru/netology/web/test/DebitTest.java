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
        debitPage.enterCardData(cardInfo);
        debitPage.verifySuccessMessage();
        assertEquals ("APPROVED", new SQLHelper().getDebitStatus());
    }

    @Test
    void shouldNotPayWithEmptyCardNumber() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithEmptyCardNumber();
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatCardNumber();
    }

    @Test
    void shouldNotPayWithEmptyMonth() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithEmptyMonth("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatMonth();
    }

    @Test
    void shouldNotPayWithEmptyYear() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithEmptyYear("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyNullYear();
    }

    @Test
    void shouldNotPayWithEmptyName() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithEmptyName("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyNullName();
    }

    @Test
    void shouldNotPayWithEmptyCvc() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithEmptyCvc("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatCvc();
    }

    @Test
    void shouldNotPayWithInvalidCardNumber() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidCardNumber();
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatCardNumber();
    }

    @Test
    void shouldNotPayWithInvalidCardNumberWithLetters() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidCardNumberWithLetters();
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatCardNumber();
    }

    @Test
    void shouldNotPayWithInvalidCardNumberWithSymbols() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidCardNumberWithSymbols();
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatCardNumber();
    }

    @Test
    void shouldNotPayWithInvalidCardNumberWithNotExistNumber() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidCardNumberWithNotExistNumber();
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatCardNumber();
    }

    @Test
    void shouldNotPayWithInvalidMonth() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidMonth("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatMonth();
    }

    @Test
    void shouldNotPayWithInvalidMonthWithOneNumber() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidMonthWithOneNumber("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatMonth();
    }

    @Test
    void shouldNotPayWithInvalidMonthWithLetters() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidMonthWithLetters("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatMonth();
    }

    @Test
    void shouldNotPayWithInvalidMonthWithSymbols() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidMonthWithSymbols("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatMonth();
    }

    @Test
    void shouldNotPayWithInvalidYear() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidYear("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatYear();
    }

    @Test
    void shouldNotPayWithInvalidYearWithOneNumber() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidYearWithOneNumber("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatYear();
    }

    @Test
    void shouldNotPayWithInvalidYearWithLetters() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidYearWithLetters("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatYear();
    }

    @Test
    void shouldNotPayWithInvalidYearWithSymbols() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidYearWithSymbols("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatYear();
    }

    @Test
    void shouldNotPayWithInvalidNameWithOneLetter() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidNameWithOneLetter("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatName();
    }

    @Test
    void shouldNotPayWithInvalidNameWithNumbers() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidNameWithNumbers("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatName();
    }

    @Test
    void shouldNotPayWithInvalidNameWithCyrillic() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidNameWithCyrillic("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatName();
    }

    @Test
    void shouldNotPayWithInvalidNameWithSymbols() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidNameWithSymbols("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatName();
    }

    @Test
    void shouldNotPayWithInvalidCvcWithOneNumber() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidCvcWithOneNumber("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatCvc();
    }

    @Test
    void shouldNotPayWithInvalidCvcWithLetters() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidCvcWithLetters("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatCvc();
    }

    @Test
    void shouldNotPayWithInvalidCvcWithSymbols() {
        var cardInfo = new DataHelper().getInvalidCardInfoWithInvalidCvcWithSymbols("approved");
        var debitPage = paymentPage.debitPayment(cardInfo);
        debitPage.enterCardData(cardInfo);
        debitPage.verifyInvalidFormatCvc();
    }
}
