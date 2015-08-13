package teste02

class Shalton {
	String nome
	String cpf
    static constraints = {nome nullable:false, blank:false, unique:true
    }
}
