package calculovotos;

public class Eleicao {

double total;

double validos;

double brancos;

double nulos;

double pctvalidos;

void porcentagemValidos() {
    
    System.out.println("Porcentagem de votos válidos: " + ((validos * 100) / total) + "%");
    
}

void porcentagemBrancos() {
    
    System.out.println("Porcentagem de votos em branco: " + ((brancos * 100) / total) + "%");
    
}

void porcentagemNulos() {
    
    System.out.println("Porcentagem de votos nulos: " + ((nulos * 100) / total) + "%");
    
}
    
}
