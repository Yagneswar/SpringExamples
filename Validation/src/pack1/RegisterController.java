package pack1;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@RequestMapping(value="getRegisterPage", method=RequestMethod.GET)
	public ModelAndView sendRegisterPage()
	{
		return new ModelAndView("register","r",new Register());
		
	}
	@RequestMapping(value="doRegister",method=RequestMethod.POST)
	public ModelAndView processRequest(@Valid @ModelAttribute("r")Register register,BindingResult result)
	{
		if(result.hasErrors())
		{
			return new ModelAndView("register");
		}
		else
		{
			return new ModelAndView("success","msg","Registration Successful.......");
		}
	}

}
