package com.java17.study01.types;

import static com.java17.study01.Validation.checkThat;

public record NickName(String nickName) {

    public NickName{
        checkThat(nickName != null && !nickName.isBlank(), "nickName must not be null or blank");
    }

    @Override
    public String toString() {
        return nickName;
    }
}
