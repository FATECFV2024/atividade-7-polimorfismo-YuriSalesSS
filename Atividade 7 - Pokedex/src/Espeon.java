public class Espeon extends Eevee {

    public Espeon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Psíquico - Psychic";
    }

    @Override
    public String defesa() {
        return "Reflexo - Reflect";
    }

    @Override
    public String especial() {
        return "Futuro psíquico - Future Sight";
    }
}
