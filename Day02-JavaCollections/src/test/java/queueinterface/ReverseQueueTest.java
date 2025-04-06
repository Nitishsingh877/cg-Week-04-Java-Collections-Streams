package queueinterface;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ReverseQueueTest {
    @Test
            void testForQueueReverse() {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(new Integer[]{10, 20, 30}));


        ReverseQueue.reverseQueue(queue);
        Queue<Integer> expected = new LinkedList<>(Arrays.asList(new Integer[]{30,20,10}));

        assertEquals(expected,queue,"test failed");
        System.out.println("test passed");


    }

}