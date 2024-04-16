package com.java17.study01.records.types;

import static com.java17.study01.records.Validation.checkThat;

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
