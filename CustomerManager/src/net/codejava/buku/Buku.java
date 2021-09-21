package net.codejava.buku;
 


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

 

@Entity
@Table(name="buku")
public class Buku {
    @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
    

    @Column(name="kode_buku")
    private String kodebuku;
    @Column(name="nama_buku")
    private String namabuku;
    
    @Column(name="kode_kategori")
    private String kodekategori;
    
    @Column(name="harga_buku")
    private int hargabuku;
    @Column(name="stok")
    private int stok;
    @Column(name="created_by")
    private String createdby;
    @Column(name="created_date")
    private Date createddate;
    @Column(name="update_by")
    private String updateby;
    @Column(name="update_date")
    private Date updatedate;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kode_kategori",nullable = false, insertable = false, updatable = false)
    private Kategori kategori;
 
    public Kategori getKategori() {
    	
	return kategori;
    }

public void setKategori(Kategori kategori) {
	this.kategori = kategori;
	}

	public Buku() {
    }
    
    
 
    protected Buku(String kodebuku, String namabuku, String kodekategori, int hargabuku, int stok, String createdby, Date createddate, String updateby, Date updatedate) {
        this.kodebuku = kodebuku;
        this.namabuku = namabuku;
        this.kodekategori = kodekategori;
        this.hargabuku = hargabuku;
        this.stok = stok;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updateby = updateby;
        this.updatedate = updatedate;
        
    }

	
	public String getKodebuku() {
		return kodebuku;
	}

	public void setKodebuku(String kodebuku) {
		this.kodebuku = kodebuku;
	}

	public String getNamabuku() {
		return namabuku;
	}

	public void setNamabuku(String namabuku) {
		this.namabuku = namabuku;
	}

	public String getKodekategori() {
		return kodekategori;
	}

	public void setKodekategori(String kodekategori) {
		this.kodekategori = kodekategori;
	}

	public int getHargabuku() {
		return hargabuku;
	}

	public void setHargabuku(int hargabuku) {
		this.hargabuku = hargabuku;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public String getUpdateby() {
		return updateby;
	}

	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	@Override
	public String toString() {
		return "Buku [kodebuku=" + kodebuku + ", namabuku=" + namabuku + ", kodekategori=" 
				+ ", hargabuku=" + hargabuku + ", stok=" + stok + ", createdby=" + createdby + ", createddate="
				+ createddate + ", updateby=" + updateby + ", updatedate=" + updatedate 
				+ ", toString()=" + super.toString() + "]";
	}



	


	
	




	
	
	
	
    
}