package ar.unq.poo2.tpComposite.ej4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory implements FileSystem {
	private String name;
	private Date createdAt;
	private List<FileSystem> content;
	
	public Directory (String name, Date createdAt, List<FileSystem> content) {
		this.setCreatedAt(createdAt);
		this.setName(name);
		this.setContent(content);
	}
	
	public Directory (String name, Date createdAt) {
		this.setCreatedAt(createdAt);
		this.setName(name);
		this.setContent(new ArrayList<FileSystem>());
	}
	
	private void setContent(List<FileSystem> content2) {
		this.content = content2;
	}

	@Override
	public int totalSize() {
		return this.getContent().stream().mapToInt(fs -> fs.totalSize()).sum();
	}
	
	@Override
	public void printStructure() {
		System.out.println(this.getName());
		this.getContent().forEach(fs -> fs.printStructure());
	}
	
	@Override
	public FileSystem lastModified() {
		return content.get(this.amountOfFiles() - 1);
	}
	
	private int amountOfFiles() {
		return this.getContent().size();
	}
	
	private List<FileSystem> getContent() {
		return this.content;
	}
	
	@Override
	public FileSystem oldestElement() {
		return getContent().get(0);
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addElement(FileSystem element) {
		this.getContent().add(element);
	}
	
}
