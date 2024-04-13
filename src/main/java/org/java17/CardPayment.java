package org.java17;

// Sealed interface CardPayment
public sealed interface CardPayment extends Payment permits CreditCardPayment, DebitCardPayment {
    // Common methods for all card payment types
}
