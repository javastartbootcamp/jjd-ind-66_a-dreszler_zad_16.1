package pl.javastart.task;

public enum Season {
    SPRING("Wiosna", new Month[]{Month.MARCH, Month.APRIL, Month.MAY}),
    SUMMER("Lato", new Month[]{Month.JUNE, Month.JULY, Month.AUGUST}),
    AUTUMN("Jesień", new Month[]{Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER}),
    WINTER("Zima", new Month[]{Month.DECEMBER, Month.JANUARY, Month.FEBRUARY});

    final String plName;
    final Month[] months;

    Season(String plName, Month[] months) {
        this.plName = plName;
        this.months = months;
    }

    String getPlName() {
        return plName;
    }

    Month[] getMonths() {
        return months;
    }

    static Season fromPlName(String name) {
        for (Season s : values()) {
            if (s.plName.equalsIgnoreCase(name)) {
                return s;
            }
        }

        return null;
    }

    static Season fromMonth(Month month) {
        for (Season s : values()) {
            for (Month m : s.months) {
                if (m == month) {
                    return s;
                }
            }
        }

        return null;
    }
}