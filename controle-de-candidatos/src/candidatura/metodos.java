package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class metodos {
     /*  -------------  METODOS ---------------------- */
    
    /*  ---- metodos para selecionar os candidatos ----- */
    static String [] candidatos = {"cand 1","cand 2","cand 3","cand 4","cand 5","cand 6","cand 7","cand 8","cand 9","cand 10"};
    static String [] selecionados= {"ninguem","ninguem","ninguem","ninguem","ninguem","ninguem"}; 
    static String [] contratados= {"ninguem","ninguem","ninguem","ninguem","ninguem"}; 
    public static  void selecaoDeCandidatos() {
        
        
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        int indice =0;
        
        
        while (candidatosSelecionados < 5 && candidatoAtual<candidatos.length) {
                 String candidato = candidatos[candidatoAtual];
                 double salarioPretendido = valorPretendido();
                System.out.println("");
                System.out.println("O candidato "+candidato+" solicitou um salario de R$ "+salarioPretendido+".");
                if (salarioBase >= salarioPretendido) {
                    System.out.println("E foi  SELECIONADO.");
                    selecionados[indice] = candidato;
                    indice++;
                    candidatosSelecionados++;   
                } else {
                    System.out.println("E NAO foi  SELECIONADO.");    
                }
                candidatoAtual++;
            }
            int s =0;
            System.out.println("");
            while (selecionados[s]!="ninguem") {
                    System.out.println("O candidato "+selecionados[s]+" foi selecionado");
                    s++;
                }    
            }
        
        /* ---- metodos auxiliares -----  */
        static boolean ligar() {
            return new Random().nextInt(3)==1;
        }
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1700,2300);
        }

        /* ---- metodo para tentar ligar para os selecionados -----  */
        public static void tentarLigar() {
            
            boolean atendeu = false;
            boolean tentarLigar = true;
            int tentativas = 1;
            int t=0;
            int p=0;
            System.out.println("");
                while (selecionados[t]!="ninguem") {
                    atendeu = ligar();
                    tentarLigar =!atendeu;
                    if (tentarLigar) {
                        tentativas++;
                    } else {
                        System.out.println("");
                        System.out.println("Atendeu a ligacao.");
                    }
    
                    if (atendeu) {
                        System.out.println("O candidato "+selecionados[t]+" atendeu na "+tentativas+"° tentativa.");
                        contratados[p] = selecionados[t];
                        p++;  
                        } else {
                            System.out.println("Nao conseguimos entrar em contato com o candidato "+selecionados[t]+".");
                        }
                        t++;
                        
                    }
                }
           
            
        
        
        static void imprimirListaDeContratados() {
            System.out.println("");
            int w=0;
            while (contratados[w]!="ninguem") {
                System.out.println("O candidato "+contratados[w]+" foi contratado");
                w++;
            }
        }
}
