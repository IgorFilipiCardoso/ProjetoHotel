package model;

import model.enums.TipoDoc;
import model.pessoas.Hospede;

/**
 * Definição da classe Identificação para a identificação do hospede
 * @atributos numero, tipo
 */
public class Indentificacao {
  private int numero;
  private TipoDoc tipo;

  /**
   * Construtor da classe Identificação
   * @param numero
   * @param tipo
   */
  public Indentificacao(int numero, TipoDoc tipo) {
    this.numero = numero;
    this.tipo = tipo;
  }

  /**
   * Método de acesso ao número da identificação
   * @return o número da identificação
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Método de acesso ao tipo da identificação
   * @return o tipo da identificação
   */
  public String getTipo() {
    return tipo.name();
  }

  /**
   * Método de modificação do número da identificação
   * @param numero
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Método de modificação do tipo da identificação
   * @param tipo
   */
  public void setTipo(TipoDoc tipo) {
    this.tipo = tipo;
  }

  /**
    * Sobrescrevendo o método toString() para fornecer uma representação textual do objeto
    * @return String contendo os dados da identificação como tipo e o número
    */
  public String toString() {
    return "Tipo: " + tipo.name() + " Numero: " + numero;
  }
}
