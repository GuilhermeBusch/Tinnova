package calculovotos;

public class CalculoVotos {

    public static void main(String[] args) {
        
        Eleicao tabela = new Eleicao();
        
        tabela.total = 1000;
        
        tabela.validos = 800;
        
        tabela.brancos = 150;
        
        tabela.nulos = 50;
        
        tabela.porcentagemValidos();
        
        tabela.porcentagemBrancos();
        
        tabela.porcentagemNulos();
        
    }
    
}
