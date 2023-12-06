package com.validationBrackets.domain.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBracketTest {

    @Test
    void mustReturnTruePassingCorrectBrackets() {
        EBracket eBracket = new EBracket();

        eBracket.setValue("(){}[]");

        assertEquals(Boolean.TRUE, eBracket.isValid());
    }

    @Test
    void shouldReturnFalsePassingIncorrectBrackets() {
        EBracket eBracket = new EBracket();

        eBracket.setValue("[{)]");

        assertEquals(Boolean.FALSE, eBracket.isValid());
    }

}