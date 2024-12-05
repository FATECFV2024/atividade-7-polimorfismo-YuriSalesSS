public class Pokedex {
    public static void main(String[] args) {
        
        // Instancias 
        Eevee eevee = new Eevee("Normal", 30, 100, 6.5);
        Jolteon jolteon = new Jolteon("Elétrico", 80, 120, 24.5);
        Vaporeon vaporeon = new Vaporeon("Água", 90, 130, 29.5);
        Flareon flareon = new Flareon("Fogo", 80, 115, 25.0);
        Espeon espeon = new Espeon("Psíquico", 80, 105, 25.3);
        Umbreon umbreon = new Umbreon("Sombrio", 100, 110, 27.0);
        Leafeon leafeon = new Leafeon("Planta", 85, 115, 26.5);
        Glaceon glaceon = new Glaceon("Gelo", 80, 100, 24.0);
        Sylveon sylveon = new Sylveon("Fada", 85, 110, 26.2);

        // Metodo imprimir
        System.out.println("Pokedex:\n");

        eevee.imprimir();
        jolteon.imprimir();
        vaporeon.imprimir();
        flareon.imprimir();
        espeon.imprimir();
        umbreon.imprimir();
        leafeon.imprimir();
        glaceon.imprimir();
        sylveon.imprimir();
    }
}
