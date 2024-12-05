public class Sylveon extends Eevee {

    public Sylveon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Magia fada - Moonblast";
    }

    @Override
    public String defesa() {
        return "Defesa mágica - Misty Terrain";
    }

    @Override
    public String especial() {
        return "Laço encantado - Draining Kiss";
    }
}
