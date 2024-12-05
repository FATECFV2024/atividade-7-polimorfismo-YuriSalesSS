public class Glaceon extends Eevee {

    public Glaceon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Raio de gelo - Ice Beam";
    }

    @Override
    public String defesa() {
        return "Capa de gelo - Ice Barrier";
    }

    @Override
    public String especial() {
        return "Tempestade de gelo - Blizzard";
    }
}
