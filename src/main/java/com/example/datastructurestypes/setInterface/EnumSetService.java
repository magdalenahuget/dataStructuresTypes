package com.example.datastructurestypes.setInterface;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetService {

    public Set<Day> getEmptyEnumSet() {
        Set<Day> enumSet = EnumSet.of(Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);
        return enumSet;
    }
}

enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

