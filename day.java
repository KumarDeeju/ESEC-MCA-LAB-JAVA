public enum day {
    Monday(true),
    Tuesday(true),
    Wednesday(true),
    Thursday(true),
    Friday(true),
    Saturday(false),
    Sunday(false);

    private final boolean isWeekday;

    day(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }

    public String getType() {
        return isWeekday ? "Weekday" : "Weekend" ;
    }

}
