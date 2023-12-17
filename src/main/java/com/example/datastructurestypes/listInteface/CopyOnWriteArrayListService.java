package com.example.datastructurestypes.listInteface;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListService {

    public List<String> getEmptyCopyOnWriteArrayList() {
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        return copyOnWriteArrayList;
    }
}
