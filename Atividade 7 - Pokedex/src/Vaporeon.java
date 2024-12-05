public class Vaporeon extends Eevee {

    public Vaporeon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Jato de Água - Water Gun";
    }

    @Override
    public String defesa() {
        return "Proteção - Aqua Ring";
    }

    @Override
    public String especial() {
        return "Hidrobomba - Hydro Pump";
    }
}
