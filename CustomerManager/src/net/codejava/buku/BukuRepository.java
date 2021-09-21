package net.codejava.buku;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 
public interface BukuRepository extends CrudRepository<Buku, String> {
     
    @Query(value = "SELECT c FROM Buku c WHERE c.namabuku LIKE '%' || :keyword || '%'"
            + " OR c.kodebuku LIKE '%' || :keyword || '%'"
            + " OR c.kodekategori LIKE '%' || :keyword || '%'")
    public List<Buku> search(@Param("keyword") String keyword);

	public Buku save(Buku buku);
	
}