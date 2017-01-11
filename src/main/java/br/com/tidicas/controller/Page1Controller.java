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
@RequestMapping("/page1")
public class Page1Controller {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView toPage1() {

		ModelAndView model = new ModelAndView("page1");
		model.addObject("msg", "Página 1");

		return model;
	}
}