public class Umbreon extends Eevee {

    public Umbreon(String tipo, int altura, int HP, double peso) {
        super(tipo, altura, HP, peso);
    }

    @Override
    public String ataque() {
        return "Poder noturno - Foul Play";
    }

    @Override
    public String defesa() {
        return "Guarda noturna - Moonlight";
    }

    @Override
    public String especial() {
        return "Trevas - Dark Pulse";
    }
}
