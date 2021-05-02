package com.solo.leetcode.greedyalgorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeetingRoomsTest {
    MeetingRooms meetingRooms;


    @BeforeEach
    void setUp() {
        meetingRooms = new MeetingRooms();
    }

    @Test
    void test1() {
        assertEquals(2, meetingRooms.noOfRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
    }

    @Test
    void test2() {
        assertEquals(1, meetingRooms.noOfRooms(new int[][]{{7, 10}, {2, 4}}));
    }
}