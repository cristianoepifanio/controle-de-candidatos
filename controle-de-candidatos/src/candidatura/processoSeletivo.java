package candidatura; 
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/**
 * processoSeletivo {}
 */
public class processoSeletivo {

    /*  ---- METODO PRINCIPAL (MAIN) ----- */
    public static void main (String[] args) {
        
        
        selecaoDeCandidatos();
        String [] selecionados = {"selecionado 1","selecionado 2","selecionado 3"};
        for (String selecionado : selecionados) {
            tentarLigar(selecionado);
        }
        imprimirListaDeContratados();
    }
    
    /*  -------------  METODOS ---------------------- */
    
    /*  ---- metodos para selecionar os candidatos ----- */
    public static  void selecaoDeCandidatos() {
        
        String [] candidatos = {"cand 1","cand 2","cand 3","cand 4","cand 5"};

             int candidatosSelecionados = 0;
             int candidatoAtual = 0;
             double salarioBase = 2000.0;
            /*  String [] selecionados = {}; */
             
             while (candidatosSelecionados <= 3 && candidatoAtual<candidatos.length) {
                 String candidato = candidatos[candidatoAtual];
                 double salarioPretendido = valorPretendido();
                
                System.out.println("O candidato "+candidato+" solicitou um salario de R$ "+salarioPretendido+".");
                if (salarioBase >= salarioPretendido) {
                    System.out.println("E foi  SELECIONADO.");
                    /* selecionados[candidatoAtual] = candidatos[candidatoAtual]; */
                    candidatosSelecionados++;   
                } else {
                    System.out.println("E NAO foi  SELECIONADO.");    
                }
                /*  String aprovados = candidatos[candidatoAtual]; */
                candidatoAtual++;
            }

            /* for (int i = 0; i < selecionados.length; i++) {
             System.out.println(selecionados[i]);
            } */
        }
        /* ---- metodos auxiliares -----  */
        static boolean ligar() {
            return new Random().nextInt(3)==1;
        }
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1700,2300);
        }
        /* ---- metodo para tentar ligar para os selecionados -----  */
        public static void tentarLigar(String selecionado) {
            boolean atendeu = false;
            boolean tentarLigar = true;
            int tentativas = 1;
            do {
                atendeu = ligar();
                tentarLigar =!atendeu;
                if (tentarLigar) {
                    tentativas++;
                } else {
                    System.out.println("Atendeu a ligacao.");
                }
            } while ( tentarLigar && tentativas <3);
            if (atendeu) {
                System.out.println("O candidato "+selecionado+" atendeu na "+tentativas+"° tentativa.");
            } else {
                System.out.println("Nao conseguimos entrar em contato com o candidato "+selecionado+".");
            }
        }
        static void imprimirListaDeContratados() {
            
        }
    
    }
        
