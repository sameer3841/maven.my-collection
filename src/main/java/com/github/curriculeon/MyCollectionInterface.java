package com.github.curriculeon;

/**
 * @ATTENTION_TO_LEARNERS - You are forbidden from modifying this class
 */
public interface MyCollectionInterface<SomeType> extends Iterable<SomeType> {
    void add(SomeType objectToAdd);
    void remove(SomeType objectToRemove);
    void remove(int indexOfObjectToRemove);
    SomeType get(int indexOfElement);
    Boolean contains(SomeType objectToCheckFor);
    Integer size();
}
