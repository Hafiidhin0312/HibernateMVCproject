package net.codejava.buku;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="kategori")
public class Kategori {
	
	    @Id
	    @Column(name="kode_kategori")
	    private String kode_kategori;
	    
	    @Column(name="deskripsi")
	    private String deskripsi;
	    
//	    @Fetch(FetchMode.SUBSELECT)
//	    @OneToMany(mappedBy = "kode_kategori", fetch = FetchType.LAZY)
//	    private List<Buku> buku;
	    
	    
	    
	    public Kategori() {
			
		}

		public Kategori(String kodekategori, String deskripsi) {
	        this.kode_kategori = kodekategori;
	        this.deskripsi = deskripsi;
	        
	    }

		public String getKodekategori() {
			return kode_kategori;
		}

		public void setKodekategori(String kodekategori) {
			this.kode_kategori = kodekategori;
		}

		public String getDeskripsi() {
			return deskripsi;
		}

		public void setDeskripsi(String deskripsi) {
			this.deskripsi = deskripsi;
		}
	    
	    
	    
	    
//	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kategori", fetch = FetchType.LAZY)
////	    private Set<Buku> buku = new HashSet<Buku>();
}
