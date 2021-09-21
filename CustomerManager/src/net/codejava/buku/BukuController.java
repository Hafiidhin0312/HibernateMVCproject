package net.codejava.buku;
 




import java.sql.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class BukuController {
 
    /**
	 * 
	 */

	@Autowired
    private BukuService bukuservice;
 
    // handler methods will go here...
    
	 @RequestMapping("/")
	    public ModelAndView home() {
//	        List<Customer> listCustomer = customerService.listAll();
	        ModelAndView mav = new ModelAndView("index");
//	        mav.addObject("listCustomer", listCustomer);
	        return mav;
	    }
    
    @RequestMapping("/listbuku")
    public ModelAndView list() {
        List<Buku> listBuku = bukuservice.listAll();
        ModelAndView mav = new ModelAndView("listbuku");
        mav.addObject("listBuku", listBuku);
        
        for (Buku buku : listBuku) {
            System.out.println(buku.toString());
		}

        return mav;
    }
    
    
    @RequestMapping("/newbuku")
    public String newBukuForm(Map<String, Object> model) {
        Buku buku = new Buku();
        model.put("buku", buku);
        return "new_buku";
    }
    
    @RequestMapping(value = "/savebuku", method = RequestMethod.POST)
    public String saveBuku(@ModelAttribute("buku") Buku buku) {
    	
//    	buku.setKodebuku("GMDB"+generatorKode());
    	bukuservice.save(buku);
        return "redirect:/listbuku";
    }
    
    
    @RequestMapping("/editbuku")
    public ModelAndView editBukuForm(@RequestParam String kodebuku) {
        ModelAndView mav = new ModelAndView("edit_buku");
        Buku buku = bukuservice.get(kodebuku);
        mav.addObject("buku", buku);
//        System.out.println(mav.getModelMap().get("buku").toString());
        return mav;
    }
    
    @RequestMapping("/deletebuku")
    public String deleteBukuForm(@RequestParam String kodebuku) {
        bukuservice.delete(kodebuku);
        return "redirect:/listbuku";       
    }
    
    @RequestMapping("/search")
    public ModelAndView search(@RequestParam String keyword) {
        List<Buku> result = bukuservice.search(keyword);
        ModelAndView mav = new ModelAndView("search");
        mav.addObject("result", result);
     
        return mav;    
    }
    
    
    public String generatorKode() {
    	Random rand = new Random();
    	int upperBound = 25;
    	int randomNumber = rand.nextInt(upperBound);
    
    	return String.valueOf(randomNumber);
    	
    	
    }
    
    
    @RequestMapping(value = "/updatebuku", method = RequestMethod.POST)
    public String updateBuku(@ModelAttribute("buku") Buku buku) {
    	
//    	System.out.println(buku.toString());
    	bukuservice.save(buku);
        return "redirect:/listbuku";
    }
    
    
    
    
    
}