public class Jolteon extends Eevee {

    public Jolteon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso); // Chamando o construtor da classe mãe
    }

    @Override
    public String ataque() {
        return "Trovoada - Thunder-shock";
    }

    @Override
    public String defesa() {
        return "Carga - Wild Charge";
    }

    @Override
    public String especial() {
        return "Raio - Thunder";
    }
}
