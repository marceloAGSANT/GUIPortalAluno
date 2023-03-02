/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  package portalaluno.model;

  // Importação dos pacotes necessários para usarmos o List e ArrayList
  import java.util.ArrayList;
  import java.util.List;

  public class ListaAluno {
      // Declaração de variáveis
      private static final List<Aluno> lista = new ArrayList<>();

      // Métodos para acessarmos a lista e adicionarmos novos itens
      public static List<Aluno> Listar() {
          return lista;
      }
      
      public static void Adicionar(Aluno aluno) {
          lista.add(aluno);
      }
      
  }