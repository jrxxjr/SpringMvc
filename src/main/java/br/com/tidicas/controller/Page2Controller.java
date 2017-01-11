package br.com.tidicas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller secundário
 * @author Evaldo Junior
 *
 */
@Controller
@RequestMapping("/page2")
public class Page2Controller {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView toPage2() {

		ModelAndView model = new ModelAndView("page2");
		model.addObject("msg", "Página 2");

		return model;
	}
}