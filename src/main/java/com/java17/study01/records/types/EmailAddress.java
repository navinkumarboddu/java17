package com.java17.study01.records.types;

import com.java17.study01.records.Validation;

import java.util.regex.Pattern;

public record EmailAddress(String emailId) {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

    public EmailAddress{
        Validation.checkThat(emailId != null && !emailId.isBlank(), "emailId must not be null or blank");
        Validation.checkThat(EMAIL_PATTERN.matcher(emailId).matches(),"not a valid email address: " + emailId);
    }

    @Override
    public String toString() {
        return emailId;
    }
}
