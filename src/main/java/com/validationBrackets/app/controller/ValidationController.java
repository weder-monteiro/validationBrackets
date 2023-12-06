package com.validationBrackets.app.controller;

import com.validationBrackets.app.dto.response.ValidationBracketsResponse;
import com.validationBrackets.app.presenter.ValidationPresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validation")
public class ValidationController {

    @Autowired
    ValidationPresenter presenter;

    @PostMapping("/brackets")
    public ResponseEntity<ValidationBracketsResponse> isValid(@RequestBody String value) {
        return ResponseEntity.ok(presenter.bracketsIsValid(value));
    }

}
