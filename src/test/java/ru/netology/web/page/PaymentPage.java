package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {

    private final SelenideElement debitButton = $("button");
    private final SelenideElement creditButton = $(byText("Купить в кредит"));

    public DebitPage debitPayment(DataHelper.CardInfo info) {
        debitButton.click();
        return new DebitPage();
    }

    public DebitPage creditPayment(DataHelper.CardInfo info) {
        creditButton.click();
        return new DebitPage();
    }
}
