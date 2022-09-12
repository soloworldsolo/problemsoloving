package com.solo.interview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    Question question;

    @BeforeEach
    void setUp() {
        question = new Question();
    }

    @Test
    void test1() {
        int[] input = {12, 121, 30, 36, 41, 56, 13, 55, 35, 44, 33, 34, 92, 43, 32, 42};

        int res = question.subsequenceCount(input);
        assertEquals(5 , res);
    }

    @Test
    void test2() {
        int[] input = {0,3,7,2,5,8,4,6,0,1};

        int res = question.subsequenceCount(input);
        assertEquals(9 , res);
    }
}