package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PaymentPage {

    private final SelenideElement debitButton = $("button");
    private final SelenideElement creditButton = $(byText("Купить в кредит"));


}
