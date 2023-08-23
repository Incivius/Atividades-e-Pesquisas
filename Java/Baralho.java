import java.util.Arrays;
import java.util.Collections;

public class Baralho {
    private int total = 56;
    private Carta[] cartas =  new Carta[total];

    public Baralho(){
        this.cartas = Preencher();
    }

    public void embaralharBaralho(){
        for (int i = 0; i < 5; i++){
            int ale1 = (int) (Math.random() * total);
            int ale2 = (int) (Math.random() * total);
            Collections.swap(Arrays.asList(cartas), ale1, ale2);
        }
    }

    public Carta distribuirCarta(Baralho baralho){
            for (int i = total; i == 0; i--) {
                if (cartas[i] != null) {
                    return cartas[i];
                    cartas[i] = null;
                    break;

                }
        }
    }
    
    public Carta[] Preencher(){
        EnumCarta[ ] deck = EnumCarta.values();
            for (int j = 0; j <= 13; j++){
                cartas[j] = new Carta(deck[j], EnumNaipe.COPAS);
                System.out.println(cartas[j].getNome() + " " + cartas[j].getNaipe());
            }
            for (int j = 0; j <= 13; j++){
                cartas[j + 13] = new Carta(deck[j], EnumNaipe.PAUS);
                System.out.println(cartas[j + 13].getNome()+ " " + cartas[j + 13].getNaipe());
            }
            for (int j = 0; j <= 13; j++){
                cartas[j + 26] = new Carta(deck[j], EnumNaipe.ESPADAS);
                System.out.println(cartas[j + 26].getNome() + " " + cartas[j + 26].getNaipe());
            }
            for (int j = 0; j <= 13; j++){
                cartas[j + 39] = new Carta(deck[j], EnumNaipe.OUROS);
                System.out.println(cartas[j + 39].getNome() + " " + cartas[j + 39].getNaipe());
            }
            for (int j = 0; j <= total; j++){
                if (cartas[j].getNome().equals(EnumCarta.CORINGA)){
                    cartas[j].setNaipe(EnumNaipe.CORINGA);
                }
            }

            return cartas;
        }

        public 
}
