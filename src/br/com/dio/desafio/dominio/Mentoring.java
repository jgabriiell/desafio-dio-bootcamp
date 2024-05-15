package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Content {
    private LocalDate date;

    @Override
    public double calculateXp() {
        return STANDARD_XP + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTittle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", data=" + date +
                '}';
    }

}
