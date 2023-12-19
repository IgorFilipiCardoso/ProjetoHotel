package model.itensCosumo;

import model.enums.TipoItens;

/**
 * Definição da classe ItensConsumo.
 * @atributos tipo do item, codigo, descricao e valor.
 */
public class ItensConsumo {
  TipoItens tipo;
  long codigo;
  String descricao;
  double valor;

    /**
     * Construtor da classe ItensConsumo que recebe parâmetros para inicializar
     * os atributos.
     * @param codigo
     * @param tipo
     * @param descricao
     * @param valor
     */
  public ItensConsumo(long codigo, TipoItens tipo, String descricao, double valor) {
    this.codigo = codigo;
    this.descricao = descricao;
    this.valor = valor;
    this.tipo = tipo;
  }


  /**
   * @return valor do item.
   */
  public double getValor() {
      return valor;
  }

    /**
     * @return codigo do item.
     */
  public long getCodigo() {
    return codigo;
  }

    /**
     * @return tipo do item.
     */
  public TipoItens getTipo() {
    return tipo;
  }

    /**
     * @return descricao do item.
     */
  public String getDescricao(){
    return descricao;
  }
}