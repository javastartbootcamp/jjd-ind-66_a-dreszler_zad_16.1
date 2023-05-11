package pl.javastart.task;

enum Month {
    JANUARY("styczeń"),
    FEBRUARY("luty"),
    MARCH("marzec"),
    APRIL("kwiecień"),
    MAY("maj"),
    JUNE("czerwiec"),
    JULY("lipiec"),
    AUGUST("sierpień"),
    SEPTEMBER("wrzesień"),
    OCTOBER("październik"),
    NOVEMBER("listopad"),
    DECEMBER("grudzień");

    final String plName;

    Month(String plName) {
        this.plName = plName;
    }

    String getPlName() {
        return plName;
    }

    static Month fromPlName(String month) {
        Month monthFromPlName = null;
        for (Month m : values()) {
            if (m.plName.equals(month)) {
                monthFromPlName = m;
                break;
            }
        }

        return monthFromPlName;
    }

    @Override
    public String toString() {
        return plName;
    }
}
