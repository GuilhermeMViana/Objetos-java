public class Aluno {
    String name;
    int rm, idade;
    float media,nota1, nota2;

    public float calcularMedia() {
        media = (nota1 + nota2) / 2;
        return media;
    }

}
