package br.com.docket.rdc.enums;

public enum RotaMapping {
	
	inicio("redirect:/home");

    private String mapping;

    RotaMapping(String descricao) {
        this.mapping = descricao;
    }

    /**
     * Gets the foward.
     *
     * @return the foward
     */
    public String getDirecao() {
        return mapping;
    }

	
	

}
