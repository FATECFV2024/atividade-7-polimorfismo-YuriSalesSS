public class Leafeon extends Eevee {

    public Leafeon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Folha navalha - Leaf Blade";
    }

    @Override
    public String defesa() {
        return "Defesa de folhas - Synthesis";
    }

    @Override
    public String especial() {
        return "Vento floral - Leaf Storm";
    }
}
