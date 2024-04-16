package com.java17.study02.sealed.rules;

// Sealed interface example
public sealed interface Shape permits Circle, Rectangle, Triangle {
    // Sealed interface cannot have direct members, but subclasses can have their own members.
}

// Rules
// 1. Sealed interfaces must have permitted subclasses.
// 2. Only the permitted subclasses can extend the sealed interface.
// 3. The permitted subclasses must have one of the following 3 modifiers: final, sealed, or non-sealed.
// 4. If a subclass is sealed, it must declare its permitted subclasses using the permits clause.
// 5. Non-sealed classes are open for extension in a way similar to regular Java classes.
// 6. The permits clause can be omitted if the sealed interface and its permitted subclasses are in the same source file.

final class Circle implements Shape {
    // Circle-specific implementation
}

non-sealed class Rectangle implements Shape {
    // Rectangle-specific implementation
}

sealed class Triangle implements Shape permits EquilateralTriangle, IsoscelesTriangle, ScaleneTriangle{
    // Triangle-specific implementation
}

final class EquilateralTriangle extends Triangle {
    // EquilateralTriangle-specific implementation
}

sealed class IsoscelesTriangle extends Triangle permits RightAngleIsoscelesTriangle, AcuteAngleIsoscelesTriangle {
    // IsoscelesTriangle-specific implementation
}

final class RightAngleIsoscelesTriangle extends IsoscelesTriangle {
    // RightAngleIsoscelesTriangle-specific implementation
}

final class AcuteAngleIsoscelesTriangle extends IsoscelesTriangle {
    // AcuteAngleIsoscelesTriangle-specific implementation
}

final class ScaleneTriangle extends Triangle {
    // ScaleneTriangle-specific implementation
}
