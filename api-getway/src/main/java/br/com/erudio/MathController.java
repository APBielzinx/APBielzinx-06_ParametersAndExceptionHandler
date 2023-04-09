package br.com.erudio;

import br.com.erudio.exceptions.UnsuportedMathOperationException;
import br.com.erudio.functions.Calcs;
import br.com.erudio.functions.ConvertToDouble;
import br.com.erudio.functions.IsNumeric;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private static final String template = "Hellow, %s!";
    private static final AtomicLong counter = new AtomicLong();

    IsNumeric isNumeric = new IsNumeric();
    Calcs calcs = new Calcs();
    ConvertToDouble convertToDouble = new ConvertToDouble();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    //soma
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{

            if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)){
                throw new UnsuportedMathOperationException("Please set a numeric value");
            }

       calcs.setNumber1(convertToDouble.convertToDouble(numberOne));
        calcs.setNumeber2(convertToDouble.convertToDouble(numberTwo));
                   return calcs.soma(calcs.getNumber1(), calcs.getNumeber2());
    }

    //subtração
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }

        calcs.setNumber1(convertToDouble.convertToDouble(numberOne));
        calcs.setNumeber2(convertToDouble.convertToDouble(numberTwo));
        return calcs.subtracao(calcs.getNumber1(), calcs.getNumeber2());
    }


    //divisão

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }

        calcs.setNumber1(convertToDouble.convertToDouble(numberOne));
        calcs.setNumeber2(convertToDouble.convertToDouble(numberTwo));
        return calcs.divisao(calcs.getNumber1(), calcs.getNumeber2());
    }


    //mult
    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    public Double mult(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }

        calcs.setNumber1(convertToDouble.convertToDouble(numberOne));
        calcs.setNumeber2(convertToDouble.convertToDouble(numberTwo));
        return calcs.mult(calcs.getNumber1(), calcs.getNumeber2());
    }


    //media
    @RequestMapping(value = "/med/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    public Double med(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{

        if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }


        calcs.setNumber1(convertToDouble.convertToDouble(numberOne));
        calcs.setNumeber2(convertToDouble.convertToDouble(numberTwo));
        return calcs.media(calcs.getNumber1(), calcs.getNumeber2());
    }

    //raiz quadrada

    @RequestMapping(value = "/rai/{numberOne}",
            method = RequestMethod.GET)

    public Double rai(
            @PathVariable(value = "numberOne") String numberOne

    ) throws Exception{

        if (!isNumeric.isNumeric(numberOne)){
            throw new UnsuportedMathOperationException("Please set a numeric value");
        }

        calcs.setNumber1(convertToDouble.convertToDouble(numberOne));
        return calcs.raizQuadrada(calcs.getNumber1());
    }






}
