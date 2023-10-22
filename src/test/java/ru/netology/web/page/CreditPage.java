package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CreditPage {

    private final SelenideElement creditHead = $(byText("Кредит по данным карты"));
    private final SelenideElement cardsNumberInput = $(byText("Номер карты"));
    private final SelenideElement monthInput = $(byText("Месяц"));
    private final SelenideElement yearInput = $(byText("Год"));
    private final SelenideElement nameInput = $(byText("Владелец"));
    private final SelenideElement cvcInput = $(byText("CVC/CVV"));
    private final SelenideElement continueButton = $(byText("Продолжить"));
    private final SelenideElement successMassage = $(".notification_status_ok");
    private final SelenideElement errorMassageForInvalidNumberOfCard = $(".input_invalid .input__sub");
    private final SelenideElement errorMassageForInvalidMonth = $(".input-group__input-case_invalid .input__sub");
    private final SelenideElement errorMassageForInvalidYear = $(byText("Истёк срок действия карты"));
    private final SelenideElement errorMassageForInvalidCvc = $(byText("Неверный формат"));
    private final SelenideElement errorMassageForNullName = $(byText("Поле обязательно для заполнения"));
    private final SelenideElement errorMassageForNullYear = $(byText("Неверный формат"));


    public CreditPage() {
        creditHead.shouldBe(visible);
    }

    public void verifySuccessMassage() {
        successMassage.shouldBe(visible, Duration.ofSeconds(15));
    }
}
