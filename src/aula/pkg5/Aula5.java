package aula.pkg5;

import java.util.Scanner;


public class Aula5 {

    public static void main(String[] args) {
        //Instanciando a classe 'Scanner'
        Scanner sc = new Scanner(System.in);
        
        //Instanciando a classe 'usuario' e declarando variáveis
        usuario u = new usuario();
        usuario u2 = new usuario();
        usuario u3 = new usuario();
        boolean comparaSenhas1;
        boolean comparaSenhas2;
        boolean comparaSenhas3;
        String msg1;
        String msg2;
        String msg3;
        
       
        //Processamento de dados 
        
        //Usuario1       
        //Nome
        System.out.println("Insira o nome do usuario 1:");
        u.nome = sc.nextLine();
        //Email
        System.out.println("Insira o email do usuario 1:");
        u.email = sc.nextLine();
        //Senha
        System.out.println("Insira a senha do usuario 1:");
        u.senha = sc.nextLine();
        //Confirmação
        System.out.println("Confirme a senha do usuario 1:");
        u.confirmacaoSenha = sc.nextLine();
        
        //Usuario2        
        //Nome
        System.out.println("Insira o nome do usuario 2:");
        u2.nome = sc.nextLine();
        //Email
        System.out.println("Insira o email do usuario 2:");
        u2.email = sc.nextLine();
        //Senha
        System.out.println("Insira a senha do usuario 2:");
        u2.senha = sc.nextLine();
        //Confirmação
        System.out.println("Confirme a senha do usuario 2:");
        u2.confirmacaoSenha = sc.nextLine();
        
        //Usuario3        
        //Nome
        System.out.println("Insira o nome do usuario 3:");
        u3.nome = sc.nextLine();
        //Email
        System.out.println("Insira o email do usuario 3:");
        u3.email = sc.nextLine();
        //Senha
        System.out.println("Insira a senha do usuario 3:");
        u3.senha = sc.nextLine();
        //Confirmação
        System.out.println("Confirme a senha do usuario 3:");
        u3.confirmacaoSenha = sc.nextLine();
        
        //Usuario1 confirmação
        comparaSenhas1 = u.senha.equals(u.confirmacaoSenha);
        
        //Usuario2 confirmação
        comparaSenhas2 = u2.senha.equals(u2.confirmacaoSenha);
        
        //Usuario3 confirmação
        comparaSenhas3 = u3.senha.equals(u3.confirmacaoSenha);
        
        //IF - 1
        if(comparaSenhas1){
            msg1 = ("A senha do usuario 1 é:" + u.senha);
        }else{
            msg1 = ("A senha " +u.senha+" difere da " +u.confirmacaoSenha);
        }
        
        //IF - 2
        if(comparaSenhas2){
            msg2 = ("A senha do usuario 2 é:" + u2.senha);
        }else{
            msg2 = ("A senha " +u2.senha+" difere da " +u2.confirmacaoSenha);
        }
        
        //IF - 3
        if(comparaSenhas3){
            msg3 = ("A senha do usuario 3 é:" + u3.senha);
        }else{
            msg3 = ("A senha " +u3.senha+" difere da " +u3.confirmacaoSenha);
        }
            
        
        //Saída das informações
        
        //Usuario1
        //Nome
        System.out.println("O nome do usuario 1 é:" + u.nome);
        //Email
        System.out.println("O email do usuario 1 é:" + u.email);
        //Senha
        System.out.println(msg1);
        
        //Usuario2
        //Nome
        System.out.println("O nome do usuario 2 é:" + u2.nome);
        //Email
        System.out.println("O email do usuario 2 é:" + u2.email);
        //Senha
        System.out.println(msg2);
        
        //Usuario3
        //Nome
        System.out.println("O nome do usuario 3 é:" + u3.nome);
        //Email
        System.out.println("O email do usuario 3 é:" + u3.email);
        //Senha
        System.out.println(msg3);
    }
    
}
