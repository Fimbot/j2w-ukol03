package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

  List<Vizitka> vizitky;

  public VizitkaController() {
    vizitky= List.of(new Vizitka("Jiří Šurýn","PROROBOT","Ostřetín 183","Ostřetín 53401","j.suryn@seznam.cz", "607779007","prorobot.cz"),
            new Vizitka("Petr Bezruc","PROROBOT","Ostřetín 2","Ostřetín 53401",null, null,"prorobot.cz"),
            new Vizitka("Jana Lopatkova","PROROBOT","Ostřetín 36","Ostřetín 53401",null, null,null));

  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView result=new ModelAndView("seznam");
    result.addObject("vizitky",vizitky);
    return result;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView result=new ModelAndView("detail");
    result.addObject("vizitka",vizitky.get(id));
    return result;
  }
}
