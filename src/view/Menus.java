package view;

import model.pessoas.*;
import model.acomodacoes.*;
import model.itensCosumo.*;
import javax.swing.*;

import java.util.List;


public class Menus {

  // Oferece o menu de funções para visualizar os dados do Hotel
  public void menuVizualizar(
          List<Hospede> hospedes,
          List<Administrador> administradores,
          List<Funcionario> funcionarios,
          List<Reserva> reservas,
          List<Acomodado> acomodados,
          List<ItensConsumo> itensConsumo,
          List<TipoAcomodacao> tiposAcomodacao,
          List<Acomodacao> acomodacoes,
          Object[] funcoesVizualizar
  ){
    String title = "Vizualizar";
    String opcao;
    Object result;

    opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opcao", title, JOptionPane.QUESTION_MESSAGE,
            null, funcoesVizualizar, funcoesVizualizar[0]);

    result = switch (opcao) {
      case "Ver hospedes" -> Visualizacao.mostrarHospedes(hospedes);
      case "Ver administradores" -> Visualizacao.mostrarAdministradores(administradores);
      case "Ver funcionarios" -> Visualizacao.mostrarFuncionarios(funcionarios);
      case "Ver reservas" -> Visualizacao.mostrarReservas(reservas);
      case "Ver acomodados" -> Visualizacao.mostrarAcomodados(acomodados);
      case "Ver itens de consumo" -> Visualizacao.mostarItensConsumo(itensConsumo);
      case "Ver consumos" -> Visualizacao.mostrarConsumos();
      case "Ver tipos de acomodacao" -> Visualizacao.mostrarTiposAcomodacao(tiposAcomodacao);
      case "Ver acomodacoes" -> Visualizacao.mostrarAcomodacoes(acomodacoes);
      default -> "Opcao invalida";
    };

    JOptionPane.showMessageDialog(null, result, title, JOptionPane.INFORMATION_MESSAGE);
  }

  // Oferece o menu de funções para remover os dados do Hotel
  public void menuRemover(
          List<Hospede> hospedes,
          List<Administrador> administradores,
          List<Funcionario> funcionarios,
          List<Reserva> reservas,
          List<Acomodado> acomodados,
          List<ItensConsumo> itensConsumo,
          List<TipoAcomodacao> tiposAcomodacao,
          List<Acomodacao> acomodacoes,
          Object[] funcoesRemover
  ){
    String title = "Remover";
    String opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opcao", title, JOptionPane.QUESTION_MESSAGE,
            null, funcoesRemover, funcoesRemover[0]);

    switch (opcao) {
      case "Remover hospede":
        Remocao.removerHospede();
        break;
      case "Remover administrador":
        Remocao.removerAdministrador();
        break;
      case "Remover funcionario":
        Remocao.removerFuncionario();
        break;
      case "Remover reserva":
        Remocao.removerReserva(reservas);
        break;
      case "Remover acomodado":
        Remocao.removerAcomodado();
        break;
      case "Remover item de consumo":
        Remocao.removerItemConsumo();
        break;
      case "Remover consumo":
        Remocao.removerConsumo();
        break;
      case "Remover tipo de acomodacao":
        Remocao.removerTipoAcomodacao();
        break;
      case "Remover acomodacao":
        Remocao.removerAcomodacao();
        break;
      default:
        JOptionPane.showMessageDialog(null, "Opcao invalida", title, JOptionPane.ERROR_MESSAGE);
        break;
    }
  }

  // Oferece o menu de funções para editar os dados do Hotel
  public void menuEditar(
          Pessoa usuario,
          List<Hospede> hospedes,
          List<Administrador> administradores,
          List<Funcionario> funcionarios,
          List<Reserva> reservas,
          List<Acomodado> acomodados,
          List<ItensConsumo> itensConsumo,
          List<TipoAcomodacao> tiposAcomodacao,
          List<Acomodacao> acomodacoes,
          Object[] funcoesEditar
  ){
    String title = "Editar";
    String opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opcao", title, JOptionPane.QUESTION_MESSAGE,
            null, funcoesEditar, funcoesEditar[0]);

    switch (opcao) {
      case "Editar hospede":
        Editar.editarHospede();
        break;
      case "Editar administrador":
        Editar.editarAdministrador();
        break;
      case "Editar funcionario":
        Editar.editarFuncionario();
        break;
      case "Editar reserva":
        Editar.editarReserva();
        break;
      case "Editar acomodado":
        Editar.editarAcomodado();
        break;
      case "Editar item de consumo":
        Editar.editarItemConsumo();
        break;
      case "Editar consumo":
        Editar.editarConsumo();
        break;
      case "Editar tipo de acomodacao":
        Editar.editarTipoAcomodacao();
        break;
      case "Editar acomodacao":
        Editar.editarAcomodacao();
        break;
      default:
        System.out.println("Opcao invalida");
        break;
    }
  }

  // Oferece o menu de funções para cadastrar os dados do Hotel
  public void menuCadastros(
          Pessoa usuario,
          List<Hospede> hospedes,
          List<Administrador> administradores,
          List<Funcionario> funcionarios,
          List<Reserva> reservas,
          List<Acomodado> acomodados,
          List<ItensConsumo> itensConsumo,
          List<TipoAcomodacao> tiposAcomodacao,
          List<Acomodacao> acomodacoes,
          Object[] funcoesCadastro,
          Object[] estados,
          int nivelAcesso)
  {
    String title = "Cadastros";
    String opcao = (String) JOptionPane.showInputDialog(null, "Escolha uma opcao", title, JOptionPane.QUESTION_MESSAGE,
            null, funcoesCadastro, funcoesCadastro[0]);

    switch (opcao) {
      case "Cadastrar hospede":
        Cadastros.cadastrarHospede(nivelAcesso, hospedes, estados, usuario);
        break;
      case "Cadastrar administrador":
        Cadastros.cadastrarAdministrador(nivelAcesso, administradores, estados, usuario);
        break;
      case "Cadastrar funcionario":
        Cadastros.cadastrarFuncionario(nivelAcesso, funcionarios, estados, usuario);
        break;
      case "Cadastrar reserva":
        Cadastros.cadastrarReserva();
        break;
      case "Cadastrar acomodado":
        Cadastros.cadastrarAcomodado();
        break;
      case "Cadastrar item de consumo":
        Cadastros.cadastrarItemConsumo(nivelAcesso, itensConsumo, usuario);
        break;
      case "Cadastrar consumo":
        Cadastros.cadastrarConsumo();
        break;
      case "Cadastrar tipo de acomodacao":
        Cadastros.cadastrarTipoAcomodacao(nivelAcesso, tiposAcomodacao, usuario);
        break;
      case "Cadastrar acomodacao":
        Cadastros.cadastrarAcomodacao(nivelAcesso, acomodacoes, acomodados, tiposAcomodacao, usuario);
        break;
      default:
        System.out.println("Opcao invalida");
        break;
    }
  }

  // Método que gerencia as opções do menu
  public boolean menu(String opcao, Pessoa usuario,
                    List<Hospede> hospedes,
                    List<Administrador> administradores,
                    List<Funcionario> funcionarios,
                    List<Reserva> reservas,
                    List<Acomodado> acomodados,
                    List<ItensConsumo> itensConsumo,
                    List<TipoAcomodacao> tiposAcomodacao,
                    List<Acomodacao> acomodacoes,
                    Object[] funcoesCadastro,
                    Object[] funcoesEditar,
                    Object[] funcoesRemover,
                    Object[] funcoesVizualizar,
                    Object[] estados,
                          int nivelAcesso)
  {
    switch (opcao) {
      case "Cadastros":
        menuCadastros(usuario, hospedes, administradores, funcionarios, reservas, acomodados, itensConsumo, tiposAcomodacao, acomodacoes, funcoesCadastro, estados, nivelAcesso);
        break;
      case "Editar":
        menuEditar(usuario, hospedes, administradores, funcionarios, reservas, acomodados, itensConsumo, tiposAcomodacao, acomodacoes, funcoesEditar);
        break;
      case "Remover":
        menuRemover(hospedes, administradores, funcionarios, reservas, acomodados, itensConsumo, tiposAcomodacao, acomodacoes, funcoesRemover);
        break;
      case "Vizualizar":
        menuVizualizar(hospedes, administradores, funcionarios, reservas, acomodados, itensConsumo, tiposAcomodacao, acomodacoes, funcoesVizualizar);
        break;
      default:
        return true;
    }
      return false;
  }
}