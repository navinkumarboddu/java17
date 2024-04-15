package com.java17.study01.types;

import java.util.regex.Pattern;

import static com.java17.study01.Validation.checkThat;

/**
 * implemented using Value Types
 */
public record Person1(long id, FullName fullName, NickName nickName, EmailAddress emailId) {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

    public Person1 {
        checkThat(fullName != null, "fullName must not be null");
        checkThat(nickName != null, "nickName must not be null");
        checkThat(emailId != null, "emailId must not be null");
    }
}
