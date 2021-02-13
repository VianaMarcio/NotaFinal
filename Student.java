package aprovacaoAluno;

public class Student {
    public String name;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;

    public double notaFinal() {
        return primeiraNota + segundaNota + terceiraNota;
    }
    public double missingPoints(){
        if (notaFinal() < 60.00) {
            return 60.0 - notaFinal();
        }
        else {
            return 0.0;
        }

    }
}
