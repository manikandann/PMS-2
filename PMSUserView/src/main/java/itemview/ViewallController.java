package itemview;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "*")
@RestController
public class ViewallController {

	@Autowired
	private ViewallDao viewallDao;
	
    
	
	 @RequestMapping(value = "/itemviewall")
	    @ResponseBody
	    public List getAllItem() {
	        try {
	            return viewallDao.getAllItem();
	        } catch (Exception ex) {
	        	System.out.println("Exception Occured "+ ex);
	            return null;
	        }
	    }
  

}
