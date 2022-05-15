package ar.unq.poo2.tpComposite.ej4;

public interface FileSystem {
	/**
	* Retorna el total ocupado en disco del receptor. Expresado en
	*cantidad de bytes.
	*/
	public int totalSize();
	
	/**
	* Imprime en consola el contenido indicando el nombre del elemento
	* e indentandolo con tantos espacios como profundidad en la
	estructura.
	*/
	public void printStructure();
	
	/**
	* Elemento mas nuevo
	*/
	public FileSystem lastModified();
	
	/** Elemento mas antiguo
	*/
	public FileSystem oldestElement();
}
