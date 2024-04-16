package com.java17.study02.sealed.rules;

public sealed class Pet extends Animal permits Dog, Cat, Fish {
}

final class Dog extends Pet{}
sealed class Cat extends Pet permits MaineCoon, Siamese{}
final class MaineCoon extends Cat{}
final class Siamese extends Cat{}
non-sealed class Fish extends Pet{}
class GoldFish extends Fish{}

// Rules
// 1. Sealed Classes must have sub-classes
// 2. Dog, Cat, Fish are only classes that are allowed to extend the sealed class
// 3. The permitted sub-classes must have one of the following 3 modifiers: final, sealed and non-sealed
// 4. Sub-class having sealed must have it's own sub-classes with permits clause
// 5. Non-sealed classes are open for extension in a way classes work by default in Java
// 6. Permits clause can be removed if sealed class and it's sub-classes are defined in the same source file