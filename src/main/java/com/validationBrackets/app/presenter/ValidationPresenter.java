package com.validationBrackets.app.presenter;

import com.validationBrackets.app.dto.response.ValidationBracketsResponse;
import com.validationBrackets.domain.usecase.ValidateBracketsUsecase;
import org.springframework.stereotype.Service;

@Service
public class ValidationPresenter {

    public ValidationBracketsResponse bracketsIsValid(String value) {
        return ValidationBracketsResponse.builder().isValid(
            ValidateBracketsUsecase.isValid(value)
        ).value(value).build();
    }

}
