package com.solo.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberOfvotesTest {
    MaxNumberOfvotes maxNumberOfvotes;
    @BeforeEach
    void setUp() {
        maxNumberOfvotes = new MaxNumberOfvotes ();
    }
    @Test
    void baseCase() {
        List<String> ballot = List.of ("asshole", "asshole", "asshole" ,"solomon","solomon","davidweiss","shanewaston","dohni","dohni","solomon");

        String winner = maxNumberOfvotes.getResult(ballot);
        Assertions.assertEquals (winner,"solomon");

    }
}