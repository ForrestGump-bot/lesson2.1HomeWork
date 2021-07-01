package com.company;

public final class Сын extends Отец {

    private String образование;
    private Хобби хобби;

    public Сын(int age, String name, Position position,  String sport,
               Профессия профессия, int time) {
        super(age, name, position, sport, профессия, time);
    }

    public String getОбразование() {
        return образование;
    }

    public Хобби getХобби() {
        return хобби;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Образование: " + getОбразование() + getХобби();
    }
}
