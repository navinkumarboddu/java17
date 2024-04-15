package com.java17.study01.types;

import java.util.regex.Pattern;

import static com.java17.study01.Validation.checkThat;

public record EmailAddress(String emailId) {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

    public EmailAddress{
        checkThat(emailId != null && !emailId.isBlank(), "emailId must not be null or blank");
        checkThat(EMAIL_PATTERN.matcher(emailId).matches(),"not a valid email address: " + emailId);
    }

    @Override
    public String toString() {
        return emailId;
    }
}
