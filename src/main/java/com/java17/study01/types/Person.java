package com.java17.study01.types;

import java.util.regex.Pattern;

import static com.java17.study01.Validation.checkThat;

/**
 * stringly-typed record causes confusion which parameter to be used
 * for what purpose example below firstName, familyName and nickName
 * can create confusion while creating Person object
 * Check Person1 on how to implement Value Types
 */
public record Person(long id, String firstName, String familyName, String nickName, String emailId) {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

    public Person{
        checkThat(firstName != null && !firstName.isBlank(), "firstName must not be null or blank");
        checkThat(familyName != null && !familyName.isBlank(), "familyName must not be null or blank");
        checkThat(nickName != null && !nickName.isBlank(), "nickName must not be null or blank");
        checkThat(emailId != null && !emailId.isBlank(), "emailId must not be null or blank");
        checkThat(EMAIL_PATTERN.matcher(emailId).matches(),"not a valid email address: " + emailId);
    }
}
