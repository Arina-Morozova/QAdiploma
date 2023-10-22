package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
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
    private final SelenideElement successMassage = $(".notification_status_ok");
    private final SelenideElement errorMassageForNumberOfCard = $(".input_invalid .input__sub");
    private final SelenideElement errorMassageForMonth = $(".input-group__input-case_invalid .input__sub");
    private final SelenideElement errorMassageForYear = $(". ");
    private final SelenideElement errorMassageForCvc = $(". ");


    public DebitPage() {
        debitHead.shouldBe(visible);
    }

    public void verifySuccessMassage() {
        successMassage.shouldBe(visible, Duration.ofSeconds(15));
    }
}
