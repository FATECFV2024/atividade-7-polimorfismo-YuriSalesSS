public class Pokedex {
    public static void main(String[] args) {
        
        // Criando instâncias de cada Pokémon
        Eevee eevee = new Eevee("Normal", 30, 100, 6.5);
        Jolteon jolteon = new Jolteon("Elétrico", 80, 120, 24.5);
        Vaporeon vaporeon = new Vaporeon("Água", 90, 130, 29.5);
        Flareon flareon = new Flareon("Fogo", 80, 115, 25.0);

        // Imprimindo as informações
        System.out.println("Pokedex:\n");

        eevee.imprimir();
        jolteon.imprimir();
        vaporeon.imprimir();
        flareon.imprimir();
    }
}
