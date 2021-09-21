package net.codejava.buku;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


 
@Service
@Transactional
public class BukuService {
    @Autowired BukuRepository repo;
     
    public void save(Buku buku) {
        repo.save(buku);
    }
     
    public List<Buku> listAll() {
        return (List<Buku>) repo.findAll();
    }
     
    public Buku get(String kodebuku) {
        return repo.findById(kodebuku).get();
    }
     
    public void delete(String kodebuku) {
        repo.deleteById(kodebuku);
    }
    
    public List<Buku> search(String keyword) {
        return repo.search(keyword);
    }

     
}