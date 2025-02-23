package ficha1ex2;

public class Pessoa {
    private String nome;
    private double idade;
    private double altura;
    private double peso;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double CalcularIMC() {
        return (this.peso) / (this.altura + this.altura);
    }
    public String classificarIMC(){
        double imc= this.CalcularIMC();
        if (imc<18.5){
            return "Abaixo do peso";
        }else if (imc<25){
            return "Peso normal";
        } else if (imc<30) {
            return "Sobrepeso";
        } else if (imc<35) {
            return "Obesidade grau 1";
        } else if (imc<48) {
            return "Obesidade grau 2";
        }else {
            return "Obesidade grau 3";
        }
    }
    public String toString(){
        return "Nome: "+this.nome+"\n"+
                "Peso: "+this.peso+"\n"+
                "Altura: "+this.altura+"\n"+
                "IMC: "+this.CalcularIMC()+"\n"+
                "Classificação: "+this.classificarIMC();
    }
}

