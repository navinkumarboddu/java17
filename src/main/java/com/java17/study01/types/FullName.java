package com.java17.study01.types;

import static com.java17.study01.Validation.checkThat;

public record FullName(String firstName, String familyName) {

    public FullName{
        checkThat(firstName != null && !firstName.isBlank(), "firstName must not be null or blank");
        checkThat(familyName != null && !familyName.isBlank(), "familyName must not be null or blank");
    }

    @Override
    public String toString() {
        return firstName + " " + familyName;
    }
}
