package com.validationBrackets.domain.usecase;

import com.validationBrackets.domain.entity.EBracket;

public class ValidateBracketsUsecase {

    public static boolean isValid(String value) {
        EBracket bracket = new EBracket();
        bracket.setValue(value);

        return bracket.isValid();
    }

}
