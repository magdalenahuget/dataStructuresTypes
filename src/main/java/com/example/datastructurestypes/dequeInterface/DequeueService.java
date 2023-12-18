package com.example.datastructurestypes.dequeInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueService {

    public Deque<String> getEmptyDeque() {
        Deque<String> deque = new ArrayDeque<>();
        return deque;
    }
}
