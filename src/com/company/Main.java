package com.company;

public class Main {

    public static void main(String[] args) {
	Профессия физрук = new Профессия("Физрук");

	Отец отец = new Отец(45, "Сейтек", Position.ГенДиректор,
            "Волейбол", "Физрук", 8);
        System.out.println(отец.getInfo());
    }
}
