package org.java17;

// Sealed interface Payment
public sealed interface Payment permits CardPayment, UnifiedPayments {
    // Common methods for all payment types
}
