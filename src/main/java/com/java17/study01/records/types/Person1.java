package com.java17.study01.records.types;

import com.java17.study01.records.Validation;

import java.util.regex.Pattern;

/**
 * implemented using Value Types
 */
public record Person1(long id, FullName fullName, NickName nickName, EmailAddress emailId) {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

    public Person1 {
        Validation.checkThat(fullName != null, "fullName must not be null");
        Validation.checkThat(nickName != null, "nickName must not be null");
        Validation.checkThat(emailId != null, "emailId must not be null");
    }
}
