package models;

public class Utilisateur {
	private int id;
	private String identifiant;
	private String password;
	private int active;
	private String mail;
	private String nom;
	private String prenom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Utilisateur(String identifiant, String password, int active, String mail, String nom, String prenom) {
		super();
		this.identifiant = identifiant;
		this.password = password;
		this.active = active;
		this.mail = mail;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Utilisateur() {
		super();
	}
	@Override
	public String toString() {
		return identifiant;
	}
	

	
}
