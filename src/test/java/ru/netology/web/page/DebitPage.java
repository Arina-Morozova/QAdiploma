package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DebitPage {

    private final SelenideElement debitHead = $(byText("Оплата по карте"));
    private final SelenideElement cardsNumberInput = $(byText("Номер карты"));
    private final SelenideElement monthInput = $(byText("Месяц"));
    private final SelenideElement yearInput = $(byText("Год"));
    private final SelenideElement nameInput = $(byText("Владелец"));
    private final SelenideElement cvcInput = $(byText("CVC/CVV"));
    private final SelenideElement continueButton = $(byText("Продолжить"));


}
