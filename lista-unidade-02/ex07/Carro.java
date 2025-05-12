public class Carro extends Veiculo {
    public Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoDeCombustivel() {
        return "Gasolina";
    }
}

public class Aviao extends Veiculo {
    public Aviao(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoDeCombustivel() {
        return "Querosene de aviação";
    }
}

public class Navio extends Veiculo {
    public Navio(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoDeCombustivel() {
        return "Diesel marítimo";
    }
}
