package Aplication;

import Entidades.Filme;
import Entidades.Streaming;
import Entidades.Usuario;

public class App {

    public static void main(String[] args) {

        //criando Streaming
        Streaming LordFlix = new Streaming();

        //Criando um Filme
        Filme filme1 = new Filme("Super Mario Bros.: O Filme","Animação","Mario é um encanador junto com seu irmão Luigi. Um dia, eles vão parar no reino dos cogumelos, governado pela Princesa Peach, mas ameaçado pelo rei dos Koopas, que faz de tudo para conseguir reinar em todos os lugares.",2023,"Livre");

        Filme filme2 = new Filme("John Wick 4: Baba Yaga ","Ação","John Wick enfrenta seus adversários mais letais até agora na próxima quarta parte da série. Com o preço de sua cabeça cada vez maior, Wick leva sua luta contra a Alta Mesa global enquanto procura os jogadores mais poderosos do submundo, de Nova York a Paris, Osaka e Berlim.",2023,"16 anos");

        Filme filme3 = new Filme("Velozes e Furiosos 9","Ação","Após os eventos do último filme, Dominic Toretto (Vin Diesel) e sua família precisam enfrentar o seu irmão mais novo Jakob (John Cena), um assassino mortal que está trabalhando com uma antiga inimiga, a cyber-terrorista Cipher (Charlize Theron).",2021,"14 anos");

        Filme filme4 = new Filme("O Jogo da Imitação","Biografia","Baseado na história real do lendário criptoanalista inglês Alan Turing, considerado o pai da computação moderna, narra a tensa corrida contra o tempo de Turing e sua brilhante equipe no projeto Ultra para decifrar os códigos de guerra nazistas e contribuir para o final do conflito.",2014,"12 anos");

        Filme filme5 = new Filme("Matrix","Ficção Científica","Um jovem programador (Keanu Reeves) é atormentado por estranhos pesadelos nos quais sempre está conectado por cabos a um imenso sistema de computadores do futuro. À medida que o sonho se repete, ele começa a levantar dúvidas sobre a realidade. E quando encontra os misteriosos Morpheus e Trinity, ele descobre que é vítima do Matrix, um sistema inteligente e artificial que manipula a mente das pessoas e cria a ilusão de um mundo real enquanto usa os cérebros e corpos dos indivíduos para produzir energia.",1999,"14 anos");


        //Criando Usuario

        Usuario usuario1 = new Usuario("Keanu Reeves","keanu@gmail.com","12345");

        Usuario usuario2 = new Usuario("Benedict Cumberbatch","bené@gmail.com","benecumber123");

        Usuario usuario3 = new Usuario("Vin Diesel","vd@outlook.com","velozes1999");

        Usuario usuario4 = new Usuario("John Cena","johnc@bol.com","cenajohn@4589");

        Usuario usuario5 = new Usuario("Dwayne Johnson","therock@hotmail.com","therock999");


        //Adicionando livros na loja

        LordFlix.adicionarFilme(filme1);
        LordFlix.adicionarFilme(filme2);
        LordFlix.adicionarFilme(filme3);
        LordFlix.adicionarFilme(filme4);
        LordFlix.adicionarFilme(filme5);

        //Listando os produtos da loja
        LordFlix.mostrarProdutos();

    }



}
