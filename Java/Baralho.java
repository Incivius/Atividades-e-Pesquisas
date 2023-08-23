import java.util.Arrays;
import java.util.Collections;

public class Baralho {
    private int total = 56;
    private Carta[] cartas = new Carta[56];

    public Baralho(){
        this.cartas = Preencher();
    }

    public void embaralharBaralho(){
        for (int i = 0; i < 60; i++){
            int ale1 = (int) (Math.random() * total);
            int ale2 = (int) (Math.random() * total);
            Collections.swap(Arrays.asList(cartas), ale1, ale2);
        }
    }

    public Carta distribuirCarta(){
        Carta cartinha = new Carta (null, null);
            for (int i = total - 1; i > 0; i--) {
                if (cartas[i] != null) {
                    cartinha = cartas[i];
                    cartas[i] = null;
                    break;
                }
        }
        System.out.println("            =======  " + cartinha.VerCarta());
        return cartinha;
    }
    
    public Carta[] Preencher(){
        EnumCarta[ ] deck = EnumCarta.values();
            for (int j = 0; j <= 13; j++){
                cartas[j] = new Carta(deck[j], EnumNaipe.COPAS);
                System.out.println(cartas[j].getNome() + " " + cartas[j].getNaipe());
            }
            for (int k = 0; k <= 13; k++){
                cartas[k + 14] = new Carta(deck[k], EnumNaipe.PAUS);
                System.out.println(cartas[k + 13].getNome()+ " " + cartas[k + 13].getNaipe());
            }
            for (int l = 0; l <= 13; l++){
                cartas[l + 28] = new Carta(deck[l], EnumNaipe.ESPADAS);
                System.out.println(cartas[l + 26].getNome() + " " + cartas[l + 26].getNaipe());
            }
            for (int m = 0; m <= 13; m++){
                cartas[m + 42] = new Carta(deck[m], EnumNaipe.OUROS);
                System.out.println(cartas[m + 39].getNome() + " " + cartas[m + 39].getNaipe());
            }
            for (int n = 0; n < total; n++){
                if (cartas[n] != null){
                    if (cartas[n].getNome().equals(EnumCarta.CORINGA)){
                                        cartas[n].setNaipe(EnumNaipe.CORINGA);
                                    }
                }
                
            }

            return cartas;
        }

        public void ImprimirBaralho(){
            for (int i = 0; i < total; i++){
                if (cartas[i] != null){
                    System.out.println(cartas[i].VerCarta());
                }
                else{
                    System.out.println(i);
                }
            }
        }
}
