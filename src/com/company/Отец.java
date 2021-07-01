package com.company;

public class Отец extends Дедушка {
    private String sport;
    private Профессия профессия;
    private int time;

    public Отец(int age, String name, Position position, String sport, String работа, int time) {
        super(age, name, position);
        this.sport = sport;
        this.профессия = профессия;
        this.time = time;
    }

    public String getSport() {
        return sport;
    }

    public Профессия getПрофессия() {
        return профессия;
    }

    public int getTime() {
        return time;
    }

    public void Информация(String sport, int time, Профессия профессия){
        System.out.println("Спорт: " + sport + "Вид профессии: " + профессия + time + " лет работы");
    }

    public String getInfo(){
        return "Возраст: " + getAge() + "Имя: " +
                getName() + "Должность: " + getPosition() +
                "Вид спорта: " + getSport() + "Работа: " + getПрофессия() + "Лет работы:" + getTime();
    }

}
