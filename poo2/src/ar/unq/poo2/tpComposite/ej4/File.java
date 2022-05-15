package ar.unq.poo2.tpComposite.ej4;

import java.util.Date;

public class File implements FileSystem {

	private String name;
	private Date lastModified;
	private byte size;
	
	public File(String name, Date lastModified, byte size) {
		this.setName(name);
		this.setLastModified(lastModified);
		this.setSize(size);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public void setSize(byte size) {
		this.size = size;
	}

	@Override
	public int totalSize() {
		return this.size;
	}

	@Override
	public void printStructure() {
		System.out.println("- " + this.getName());
	}

	@Override
	public FileSystem lastModified() {
		return this;
	}

	@Override
	public FileSystem oldestElement() {
		return this;
	}

}
