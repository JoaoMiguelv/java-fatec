package exemplos_basicos;
public class exemplo3 {
    public static void main(String[] args) throws Exception {
       int vetor[] = {5, 6, 8, 10, 13};
       boolean achou = false;
       for(int i = 0; !achou && i < vetor.length; i++) {
           if(vetor[i] == 10) {
               achou = true;
           }
           System.out.println(achou);
       }
        
    }
}
