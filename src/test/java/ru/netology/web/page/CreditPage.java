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
    private final SelenideElement successMessage = $(".notification_status_ok");
    private final SelenideElement errorMessage = $(".notification_status_error");
    private final SelenideElement errorMessageForInvalidNumberOfCard = $(".input_invalid .input__sub");
    private final SelenideElement errorMessageForInvalidMonth = $(".input-group__input-case_invalid .input__sub");
    private final SelenideElement errorMessageForInvalidYear = $(byText("Истёк срок действия карты"));
    private final SelenideElement errorMessageForInvalidCvc = $(byText("Неверный формат"));
    private final SelenideElement errorMessageForNullName = $(byText("Поле обязательно для заполнения"));
    private final SelenideElement errorMessageForNullYear = $(byText("Неверный формат"));


    public CreditPage() {
        creditHead.shouldBe(visible);
    }

    public void verifySuccessMessage() {
        successMessage.shouldBe(visible, Duration.ofSeconds(15));
    }

    public void verifyErrorMessage() {
        errorMessage.shouldBe(visible, Duration.ofSeconds(15));
    }
}
