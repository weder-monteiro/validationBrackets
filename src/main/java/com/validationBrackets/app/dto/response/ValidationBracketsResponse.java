package com.validationBrackets.app.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ValidationBracketsResponse {

    private String value;
    private boolean isValid;

}
