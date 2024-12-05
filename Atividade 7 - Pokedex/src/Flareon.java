public class Flareon extends Eevee {

    public Flareon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Labareda - Flamethrower";
    }

    @Override
    public String defesa() {
        return "Escudo de Fogo - Fire Shield";
    }

    @Override
    public String especial() {
        return "Explosão de Fogo - Fire Blast";
    }
}
