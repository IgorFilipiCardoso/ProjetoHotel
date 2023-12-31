package view;

import model.acomodacoes.Acomodacao;
import model.acomodacoes.Acomodado;
import model.acomodacoes.Reserva;
import model.acomodacoes.TipoAcomodacao;
import model.itensCosumo.ItensConsumo;
import model.pessoas.Administrador;
import model.pessoas.Funcionario;
import model.pessoas.Hospede;

import java.util.List;

/**
 * Definição da classe Vizualição que permite realizar a visualização dos setores do hotel
 */
public class Visualizacao {
  /**
   * Método para mostrar os hóspedes em uma janela de diálogo
   * @param hospedes hospedes
   * @return os hospedes
   */
  public static Object mostrarHospedes(List<Hospede> hospedes) {
    StringBuilder message = new StringBuilder();

    message.append("--------------------------------------------------").append("\n");
    for (Hospede hospede : hospedes) {
      message.append(hospede.toString()).append("\n");
      message.append("--------------------------------------------------").append("\n");
    }

    return message.toString();
  }

  /**
   * Método para mostrar os administradores em uma janela de diálogo
   * @param administradores administradores
   * @return os administradores
   */
  public static Object mostrarAdministradores(List<Administrador> administradores) {
    StringBuilder message = new StringBuilder();

    message.append("--------------------------------------------------").append("\n");
    for (Administrador administrador : administradores) {
      message.append(administrador.toString()).append("\n");
      message.append("--------------------------------------------------").append("\n");
    }

    return message.toString();
  }

  /**
   * Método para mostrar os funcionários em uma janela de diálogo
   * @param funcionarios funcionarios
   * @return os funcionarios
   */
  public static Object mostrarFuncionarios(List<Funcionario> funcionarios) {
    StringBuilder message = new StringBuilder();

    message.append("--------------------------------------------------").append("\n");
    for (Funcionario funcionario : funcionarios) {
      message.append(funcionario.toString()).append("\n");
      message.append("--------------------------------------------------").append("\n");
    }

    return message.toString();
  }

  /**
   * Método para mostrar os iten de consumo
   * @param itensConsumoDisponiveis itens de consumo
   * @return os itens de consumo
   */
  public static Object mostarItensConsumo(List<ItensConsumo> itensConsumoDisponiveis){

    StringBuilder message = new StringBuilder();

    message.append("--------------------------------------------------").append("\n");
    for (ItensConsumo item : itensConsumoDisponiveis) {
      message.append(item.toString()).append("\n");
      message.append("--------------------------------------------------").append("\n");
    }

    return message.toString();
  }

  /**
   * Método para mostrar as acomodações disponíveis
   * @param acomodacoesDisponiveis acomodacoes disponiveis
   * @return as acomodacoes disponiveis
   */
  public static Object mostrarAcomodacoes(List<Acomodacao> acomodacoesDisponiveis) {

    StringBuilder message = new StringBuilder();

    message.append("--------------------------------------------------").append("\n");
    for (Acomodacao acomodacao : acomodacoesDisponiveis) {
      message.append(acomodacao.toString()).append("\n");
      message.append("--------------------------------------------------").append("\n");
    }

    return message.toString();
  }

  /**
   * Método para mostrar os tipos de acomodações
   * @param tiposAcomodacao tipos de acomodacao
   * @return as acomodações
   */
  public static Object mostrarTiposAcomodacao(List<TipoAcomodacao> tiposAcomodacao) {

    StringBuilder message = new StringBuilder();

    message.append("--------------------------------------------------").append("\n");
    for (TipoAcomodacao tipoAcomodacao : tiposAcomodacao) {
      message.append(tipoAcomodacao.toString()).append("\n");
      message.append("--------------------------------------------------").append("\n");
    }

    return message.toString();
  }

  /**
   * Método para mostrar os acomodados
   * @param acomodados acomodados
   * @return os acomodados
   */
  public static Object mostrarAcomodados(List<Acomodado> acomodados) {

    StringBuilder message = new StringBuilder();

    message.append("--------------------------------------------------").append("\n");
    for (Acomodado acomodado : acomodados) {
      message.append(acomodado.toString()).append("\n");
      message.append("--------------------------------------------------").append("\n");
    }

    return message.toString();
  }

  /**
   * Método para mostrar as reservas
   * @param reservas reservas
   * @return as reservas
   */
  public static Object mostrarReservas(List<Reserva> reservas) {

    StringBuilder message = new StringBuilder();

    message.append("--------------------------------------------------").append("\n");
    for (Reserva reserva : reservas) {
      message.append(reserva.toString()).append("\n");
      message.append("--------------------------------------------------").append("\n");
    }

    return message.toString();
  }
}
