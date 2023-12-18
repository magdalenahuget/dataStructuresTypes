package com.example.datastructurestypes.queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueService {

    public Queue<String> getEmptyQueue() {
        Queue<String> queue = new LinkedList<>();
        return queue;
    }
}
