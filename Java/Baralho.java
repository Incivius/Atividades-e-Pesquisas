import java.util.Arrays;
import java.util.Collections;

public class Baralho {
    private int total = 4;
    private Carta[] cartas =  new Carta[total];

    public Baralho(){
        this.cartas = Escolha();
    }

    public void embaralharBaralho(){
        for (int i = 0; i < 5; i++){
            int ale1 = (int) (Math.random() * total);
            int ale2 = (int) (Math.random() * total);
            Collections.swap(Arrays.asList(cartas), ale1, ale2);
        }
    }

    public Carta[] Escolha(){
        EnumCarta[] nome = EnumCarta.values();
        EnumNaipe[] naipe = EnumNaipe.values();
            for (int i = 0; i < total; i++){
                

            }
            Carta card = new Carta(EnumCarta.A, EnumNaipe.COPAS);
            return cartas;
        }
    
    public Carta distribuirCarta(){
        for (int i = 0; i < total; i++) {
            if (cartas[total-(i+1)] != null) {
                Carta cartaUltima = cartas[total-(i+1)];
                cartas[total-(i+1)] = null;
                return cartaUltima;
            }
        }
    return null;
    }   
}
