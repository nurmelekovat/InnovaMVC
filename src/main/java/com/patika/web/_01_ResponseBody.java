package com.patika.web;

//DTO- Data Transfer Object,
//DAO- Data Access Object


//import com.patika.model.Student;
//import com.patika.model.WriterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
public class _01_ResponseBody {
    //@GetMapping:url
    //return: gidelecek sayfa
    //1
    //http://localhost:3333/birinci
    @GetMapping("/birinci")
    @ResponseBody //sayfaya gitmeden ekranda yazdırmak
    public String birinciMethod() {
        return "Yükleniyor...";
    }

    //2
    //http://localhost:3333/ikinci
    @GetMapping("/ikinci")
    public String ikinciMethod() {
        return "index";
    }
    //3
    //http://localhost:3333/ucuncu
    @GetMapping("/ucuncu")
    public String ucuncuMethod() {
        return "other/deneme";
    }
    //4
    //http://localhost:3333/dorduncu
    @GetMapping("/dorduncu")
    public String dorduncuMethod(Model model) {
        model.addAttribute("param_key", "Merhabalar Spring Model ile geldi data");
        return "param";
    }



}
