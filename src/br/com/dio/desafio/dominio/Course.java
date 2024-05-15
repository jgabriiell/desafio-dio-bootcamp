package br.com.dio.desafio.dominio;

public class Course extends Content {
    private int studyLoad;

    @Override
    public double calculateXp() {
        return STANDARD_XP * this.studyLoad;
    }

    public int getStudyLoad() {
        return studyLoad;
    }

    public void setStudyLoad(int studyLoad) {
        this.studyLoad = studyLoad;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTittle() + '\'' +
                ", descricao='" + getDescription() + '\'' +
                ", cargaHoraria=" + studyLoad +
                '}';
    }
}
