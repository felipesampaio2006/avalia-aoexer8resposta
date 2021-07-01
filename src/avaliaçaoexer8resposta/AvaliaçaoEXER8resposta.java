package avaliaçaoexer8resposta;
/**
 * @author Felipe
 * 
 * Foi feita uma pesquisa entre os habitantes de uma região e coletados os dados de altura e sexo (0=masc, 1=fem)
das pessoas. Faça um programa que leia 50 dados diferentes e informe:
 a maior e a menor altura encontradas;
 a média de altura das mulheres;
 a média de altura da população;
 o percentual de homens na população
 */
public class AvaliaçaoEXER8resposta {
    public static void main(String[] args) {
        double altura = 0, sexo = 0, masc, fem, maior = 0, menor = 0, i;
        for(i=0; i<5; i++){
            System.out.println("Digite 0 para MASCULINO e 1 para FEMININO");
            System.out.println("Sexo:\n");
         if(sexo==0){ 
             System.out.println("Altura:\n");
          if(maior<altura){
              maior=altura;
          }else if(menor<altura && maior>menor){ 
              menor=altura;
          }else
              if(sexo==1){
                  System.out.println("Altura: \\n");
                  if(maior<altura){
                      maior=altura;
              }else if(menor<altura && maior>menor){
                   menor=altura;
              }                  
         }
        }
    }
}  
}    