/**
 * 
 */
package com.corridor.security.saml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author anushm
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/index")
    public String index() {
        return "index";
    }
}
