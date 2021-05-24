package br.edu.uffs.engSoftware.enums;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * @author felip
 * 
 */

public enum Categoria {

	MATERIAL(1L, "Materiais"),
	SALA(2L, "Salas"),
	ELETRONICO(3L, "Eletronicos");
	
	private Long codigo;
	private String descricao;
	
	Categoria(Long codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static Categoria getCategoriaByCodigo(Long codigo) {
		if (codigo == null) {
			return null;
		}
		for (Categoria categoria : Categoria.values()) {
			if (categoria.codigo.equals(codigo)) {
				return categoria;
			}
		}
		return null;
	}

}