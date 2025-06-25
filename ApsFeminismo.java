
import java.util.Scanner;

// Código criado por Liana Maria Barbosa da Silva Ribeiro Lopes
public class ApsFeminismo {

    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        Boolean sair = false;
        int opcao;

        do {
            System.out.println("Bem-vindo ao programa de conscientização sobre o Feminismo!");
            System.out.println(
                    "Este programa tem como objetivo informar e educar sobre a importância do feminismo e a luta pela igualdade de gênero.");
            System.out.println(
                    "______________________________________________________________________________________________________");
            System.out.println("1- Apresentação sobre o tema  ");
            System.out.println("2- Conceitos iniciais");
            System.out.println("3- Quiz interativo");
            System.out.println("4- Cenários e Decisões ");
            System.out.println("5- Informações e estatisticas");
            System.out.println("6- Dicas de Combate ao Machismo");
            System.out.println("7- Sair");
            System.out.println(
                    "______________________________________________________________________________________________________");
            System.out.println("Escolha uma opção");
            opcao = entra.nextInt();

            if (opcao == 7 || sair == true) {
                System.out.println(
                        "______________________________________________________________________________________________________");
                System.out.println("Obrigado por usar o nosso programa!");
                System.out.println(
                        "Continue colaborando com a Equidade de gênero! Até a próxima!");
                break;
            } else {
                switch (opcao) {
                    // Apresentação Sobre a temática
                    case 1:
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println(
                                "O movimento feminista é um movimento social, político e filosófico que busca a igualdade de direitos e oportunidades entre mulheres e homens. Ele questiona as desigualdades de gênero existentes nas sociedades, que historicamente favoreceram os homens, e luta por transformações que permitam às mulheres alcançar autonomia, liberdade e justiça em todas as esferas da vida.\n"
                                + //
                                "\n"
                                + //
                                "Principais objetivos do movimento feminista:\n"
                                + //
                                "\n"
                                + //
                                "Igualdade de gênero: Buscar a equiparação de direitos em áreas como política (direito ao voto e participação em cargos públicos), trabalho (igualdade salarial e oportunidades), educação, saúde e família.\n\n"
                                + //
                                "Combate à violência de gênero: Lutar contra todas as formas de violência direcionadas a mulheres, como violência física, sexual, psicológica, patrimonial e feminicídio.\n\n"
                                + //
                                "Autonomia e liberdade: Defender o direito das mulheres de tomar decisões sobre seus próprios corpos e vidas, incluindo questões relacionadas à saúde sexual e reprodutiva, educação e escolhas profissionais.\n\n"
                                + //
                                "Desconstrução de estereótipos de gênero: Questionar e desconstruir os papéis sociais predefinidos para homens e mulheres, buscando uma sociedade onde as pessoas possam ser livres para expressar suas identidades sem serem limitadas por expectativas baseadas no sexo.\n\n"
                                + //
                                "Empoderamento feminino: Fortalecer as mulheres para que reconheçam seu próprio valor, conquistem seus direitos e participem ativamente na transformação da sociedade.\n");
                        break;
                    // Conceitos iniciais
                    case 2:
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("O que é o movimento Feminista?");
                        System.out.println(
                                "Feminismo é um conjunto de movimentos políticos, sociais, ideologias e filosofias que têm como objetivo comum: direitos equânimes e uma vivência humana por meio do empoderamento feminino, dos direitos das mulheres e da libertação de padrões patriarcais, baseados em normas de gênero.");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("O que é o Machismo?");
                        System.out.println(
                                "O machismo é um sistema de crenças e práticas que promove a suposta superioridade do homem sobre a mulher, justificando a desigualdade de poder e a subordinação das mulheres. \n É uma ideologia que se manifesta em comportamentos, atitudes e instituições que favorecem os homens em detrimento das mulheres, perpetuando a desigualdade de género");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println(
                                "Direitos Humanos, o que são e por que se aplica a mulheres também?");
                        System.out.println(
                                "Direitos Humanos são direitos inerentes a todas as pessoas, independentemente de sua identidade, e são universalmente reconhecidos como essenciais para uma vida digna e livre. \n As mulheres, como qualquer outro grupo humano, também possuem esses direitos, e sua promoção e proteção são fundamentais para uma sociedade justa e igualitária. ");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("O que seria o Patricarcado?");
                        System.out.println(
                                " Um sistema social em que os homens detêm o poder primário e predominam em papéis de liderança política, autoridade moral, privilégio 1  social e controle da propriedade.");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("O que seria a Interseccionalidade?");
                        System.out.println(
                                "A Interseccionalidade, em resumo, é um conceito que reconhece como diferentes fatores sociais (como raça, gênero, classe, orientação sexual, etc.) se cruzam e se influenciam mutuamente, criando experiências e desigualdades complexas. \n É uma forma de compreender a diversidade e as desigualdades, reconhecendo que as pessoas não são apenas definidas por uma única característica, mas sim pela interação de diversas identidades.");
                        System.out.println(
                                "______________________________________________________________________________________________________\n");
                        break;
                    // Quiz interativo
                    case 3:
                        int score = 0;
                        String resposta1,
                         resposta2,
                         resposta3,
                         resposta4,
                         resposta5;
                        entra.nextLine(); //Limar scanner

                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println(
                                "Bem vindo ao quiz onde testaremos seus conhecimentos sobre o assunto!\n");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        // Pergunta 1
                        System.out.println("1- O que é Feminismo?");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println(
                                "A) A crença de que as mulheres são superiores aos homens. ");
                        System.out.println(
                                "B) Um movimento político, social e filosófico que busca a igualdade de direitos e oportunidades entre homens e mulheres.");
                        System.out.println(
                                "C) A luta para que as mulheres dominem a sociedade.");
                        System.out.println("D) Um grupo de mulheres que não gostam de homens.");

                        resposta1 = entra.nextLine();

                        if (resposta1.equalsIgnoreCase("B")) {
                            System.out.println("Correto!\n");
                            score++;
                            System.out.println("Sua pontução atual é : " + score);
                        } else {
                            System.out.println("Resposta incorreta! A resposta corret é o item B!\n");
                        }

                        // Pergunta 2
                        System.out.println(
                                "2- Qual dos seguintes NÃO é um objetivo central do feminismo?");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("A) Igualdade salarial entre gêneros. ");
                        System.out.println("B) Fim da vilência de gênero.");
                        System.out.println(
                                "C) A manutenção das funções tradicionais de gênero.");
                        System.out.println("D) O direito à autonomia sobre o próprio corpo.");
                        System.out.println(
                                "______________________________________________________________________________________________________");

                        resposta2 = entra.nextLine();

                        if (resposta2.equalsIgnoreCase("C")) {
                            System.out.println("Correto!\n");
                            score++;
                            System.out.println("Sua pontução atual é: " + score);

                        } else {
                            System.out.println("Resposta incorreta! A resposta correta é o item C! \n");

                        }
                        // Pergunta 3
                        System.out.println(
                                "3- O que significa o termo 'patriarcado' no contexto do feminismo?");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("A) Igualdade salarial entre gêneros. ");
                        System.out.println("B) Fim da violência de gênero.");
                        System.out.println(
                                "C) A manutenção das funções tradicionais de gênero.");
                        System.out.println("D) O direito à autonomia sobre o próprio corpo.");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        resposta3 = entra.nextLine();

                        if (resposta3.equalsIgnoreCase("B")) {
                            System.out.println("Correto!\n");
                            score++;
                            System.out.println("Sua pontução atual é: " + score);
                        } else {
                            System.out.println("Resposta incorreta! A resposta correta é o item B!");

                        }
                        // Pergunta 4
                        System.out.println(
                                "4- Qual a diferença entre 'sexo' e 'gênero' na perspectiva feminista?");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println(
                                "A) Não há diferença, os termos são usados de forma intercambiável.");
                        System.out.println(
                                "B) 'Sexo' refere-se às características sociais e culturais atribuídas a homens e mulheres, enquanto 'gênero' se refere às diferenças biológicas.");
                        System.out.println(
                                "C) 'Sexo' refere-se às diferenças biológicas (cromossomos, hormônios, anatomia), enquanto 'gênero' se refere às construções sociais, comportamentais, culturais e psicológicas associadas a ser homem ou mulher.");
                        System.out.println(
                                "D) 'Gênero' é um termo biológico e 'sexo' é uma construção social.");
                        System.out.println(
                                "______________________________________________________________________________________________________");

                        resposta4 = entra.nextLine();

                        if (resposta4.equalsIgnoreCase("C")) {
                            System.out.println("Correto!\n");
                            score++;
                            System.out.println("Sua pontução atual é: " + score);
                        } else {
                            System.out.println("Resposta incorreta! O item correto é o item C! \n");

                        }
                        // Pergunta 5
                        System.out.println("5- O que é 'interseccionalidade' no feminismo?");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println(
                                "A) A ideia de que todas as mulheres vivenciam a opressão da mesma forma ");
                        System.out.println(
                                "B) A união de todos os movimentos sociais em prol de uma causa comum.");
                        System.out.println(
                                "C) O reconhecimento de que diferentes aspectos da identidade de uma pessoa (como raça, classe, orientação sexual, etc.) se cruzam e podem criar experiências únicas de opressão e privilégio.");
                        System.out.println(
                                "D) A separação das lutas feministas de outras questões sociais.");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        resposta5 = entra.nextLine();

                        if (resposta5.equalsIgnoreCase("C")) {
                            System.out.println("Correto!\n");
                            score++;
                            System.out.println("Sua pontução atual é: " + score);
                        } else {
                            System.out.println("Resposta incorreta! O item correto é o item C! \n");
                        }

                        System.out.println("Sua pontução no quiz foi: " + score);
                        break;
                    // Cenários e decisões
                    case 4:
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println(
                                "Aqui temos alguns casos cotidianos hipotéticos que podem vir ocorrer quando menos se espera. Com os seus conhecimentos sobre o tema, escolha a ação correta para evitar ou corrigir as situações ");
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("Caso 1:");
                        System.out.println(
                                " Uma mulher em uma entrevista de emprego percebe que o entrevistador faz perguntas focadas em seus planos de ter filhos \n e como isso afetaria sua disponibilidade, enquanto os candidatos homens não são questionados sobre isso.");
                        System.out.println("O que você faria:?");
                        System.out.println(
                                "A) Ela responde às perguntas de forma breve e tenta direcionar a conversa de volta para suas qualificações profissionais.");
                        System.out.println(
                                "B) Ela ignora as perguntas e continua falando sobre sua experiência.");
                        System.out.println(
                                "C) Ela questiona o entrevistador sobre a relevância dessas perguntas para sua capacidade de realizar o trabalho, apontando para o tratamento desigual em relação aos candidatos homens.");
                        System.out.println(
                                "______________________________________________________________________________________________________");

                        String respostaCenario1 = entra.nextLine();
                        if (respostaCenario1.equalsIgnoreCase("c")) {
                            System.out.println("Correto!");
                        } else {
                            System.out.println("Resposta incorreta!");
                        }

                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("Caso 2:");
                        System.out.println(
                                " Em um grupo de amigos, fazem piadas sexistas sobre mulheres. Uma das integrantes do grupo se sente desconfortável.");
                        System.out.println("O que você faria:?");
                        System.out.println("A) Ela ri junto para não criar um clima ruim.");
                        System.out.println("B) Ela se afasta do grupo discretamente.");
                        System.out.println(
                                "C) Ela expressa seu desconforto com as piadas e explica por que as considera ofensivas, convidando à reflexão.");
                        System.out.println(
                                "______________________________________________________________________________________________________");

                        String respostaCenario2 = entra.nextLine();
                        if (respostaCenario2.equalsIgnoreCase("C")) {
                            System.out.println("Correto!");
                        } else {
                            System.out.println("Resposta incorreta! O item correto é o item C \n");
                        }

                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("Caso 3:");
                        System.out.println(
                                " Uma menina gosta muito de carros e mecânica, mas ouve comentários de que 'isso não é coisa de menina' e que ela deveria se interessar por atividades mais 'femininas'.");
                        System.out.println("O que você faria:?");
                        System.out.println(
                                "A) Ela deixa de lado seu interesse por carros para se encaixar nas expectativas.");
                        System.out.println(
                                "B) Ela continua gostando de carros, mas não comenta com as pessoas para evitar julgamentos.");
                        System.out.println(
                                "C) Ela continua a explorar seu interesse por carros e mecânica, ignorando os estereótipos de gênero e buscando outras pessoas com interesses similares.");
                        System.out.println(
                                "______________________________________________________________________________________________________");

                        String respostaCenario3 = entra.nextLine();
                        if (respostaCenario3.equalsIgnoreCase("c")) {
                            System.out.println("Correto!");
                        } else {
                            System.out.println("Resposta incorreta! O item correto é o item C \n");
                        }

                        break;
                    // Informações e estatísticas
                    case 5:
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("Diferença Salarial entre gênero \n \n");
                        System.out.println(
                                "Disparidade Média: Em média, as mulheres no Brasil ganham menos que os homens. As estimativas variam, mas dados recentes indicam que essa diferença pode ser de cerca de 19,4% no geral.\n\n");
                        System.out.println(
                                "Cargos de Liderança: A desigualdade salarial tende a ser ainda maior em cargos de diretoria e gerência, chegando a 25,2%.\n\n");
                        System.out.println(
                                "a diferença salarial entre homens e mulheres no Brasil é uma questão complexa e persistente, com variações dependendo do cargo, setor e raça. \n Apesar da legislação recente e das iniciativas de transparência, ainda há um longo caminho a percorrer para alcançar a igualdade salarial plena. \n\n ");
                        System.err.println("Feminicídio e Homicídios no Brasil: ");
                        System.out.println(
                                "Feminicídio: Uma parte importante dos homicídios de mulheres se enquadra na categoria de feminicídio, que é o assassinato de mulheres por razões da condição de sexo feminino, frequentemente associado à violência doméstica e familiar, \n misoginia e desigualdade de gênero. Em 2023, foram registrados 1.467 casos de feminicídio no Brasil.\n\n");
                        System.out.println(
                                "Homens são a maioria das vítimas de homicídio no Brasil. As dinâmicas de violência que levam a esses homicídios estão frequentemente ligadas a criminalidade, conflitos interpessoais em espaços públicos e outros fatores.\n\n");
                        System.out.println(
                                "Mulheres, embora sejam uma minoria nas estatísticas gerais de homicídio, são desproporcionalmente vítimas de violência dentro de casa e de feminicídio. A violência contra a mulher está frequentemente enraizada em relações de poder desiguais, violência doméstica e misoginia.\n\n");
                        break;
                    // Dicas de Combate ao Machismo
                    case 6:
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println(
                                "Combater o machismo é um esforço contínuo e que envolve diversas frentes. Aqui estão algumas dicas práticas que você pode aplicar no seu dia a dia:\n\n");

                        System.out.println(
                                "Questione seus próprios preconceitos: Esteja sempre atento às suas próprias falas e pensamentos. Analise se eles reforçam estereótipos de gênero ou desigualdades. Ninguém está imune ao machismo internalizado.\n\n"
                                + //
                                "Desconstrua estereótipos: Evite generalizações sobre homens e mulheres. Lembre-se que cada indivíduo é único, com seus próprios gostos, habilidades e características, independentemente do gênero.\n\n"
                                + //
                                "Repense os papéis de gênero: Questione a divisão tradicional de tarefas e responsabilidades baseada no sexo. Tanto homens quanto mulheres podem e devem realizar atividades domésticas, cuidar dos filhos e ter carreiras de sucesso.\n\n"
                                + //
                                "Pratique a empatia: Tente se colocar no lugar das mulheres e entender suas experiências com o machismo. Escute atentamente suas vivências e valide seus sentimentos.\n\n"
                                + //
                                "Informe-se e eduque-se: Busque conhecimento sobre o feminismo, a história da luta das mulheres e as diferentes formas que o machismo se manifesta na sociedade. Livros, documentários, podcasts e artigos são ótimas fontes de informação. \n\n");

                        System.out.println("Nas suas interações com outras pessoas:\n\n");
                        System.out.println(
                                "Não tolere comentários e piadas machistas: Seja firme ao repreender falas que inferiorizam as mulheres, objetificam seus corpos ou reforçam estereótipos. Explique por que essas atitudes são problemáticas, mesmo que pareçam \"inocentes\".\n\n"
                                + //
                                "6Interrompa falas machistas: Se presenciar uma conversa com conteúdo machista, procure intervir de forma educada, apresentando uma perspectiva diferente e convidando à reflexão.\n\n"
                                + //
                                "Amplifique vozes femininas: Em espaços de discussão, incentive a participação das mulheres, ouça atentamente suas opiniões e valorize suas contribuições. Se notar que uma mulher está sendo interrompida, ajude a trazer a palavra de volta para ela.\n\n"
                                + //
                                "Seja um aliado: Apoie as mulheres em suas lutas e reivindicações por igualdade. Mostre solidariedade em situações de discriminação ou violência de gênero.\n\n"
                                + //
                                "Eduque crianças e adolescentes: Ensine meninos e meninas sobre respeito, igualdade e a importância de desconstruir o machismo desde cedo. Incentive a autonomia e a liberdade de expressão para ambos.\n\n"
                                + //
                                "Denuncie casos de violência: Se souber de alguma situação de violência contra a mulher, seja física, psicológica, sexual ou patrimonial, não se omita. Denuncie às autoridades competentes ou ofereça apoio à vítima para que ela possa buscar ajuda.\n\n"
                                + //
                                "Use a linguagem de forma inclusiva: Evite o uso de termos masculinos genéricos quando se referir a grupos mistos. Opte por palavras neutras ou utilize \"mulheres e homens\", \"todos e todas\", etc.\n\n");

                        break;
                    // Encerramento
                    case 7:
                        System.out.println(
                                "______________________________________________________________________________________________________");
                        System.out.println("Obrigado por usar o nosso programa!");
                        System.out.println(
                                "Continue colaborando com a Equidade de gênero! Até a próxima!");
                        sair = false;
                        break;
                    default:
                        System.out.println("Opção inválida");
                        break;

                }
            }
        } while (sair == false);

        entra.close();
    }
}
